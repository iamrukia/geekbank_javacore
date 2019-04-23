package jsch.ssh.demo;

import com.jcraft.jsch.*;

import java.io.IOException;
import java.io.InputStream;

public class SshUtil {

    private static JSch jSch;
    private static Session session;
    private static Channel channel;
    private static InputStream is;

    public static String executeSSHCommand(String userName,
                                           String host,
                                           String password,
                                           String port,
                                           String command) {

        String returnString = "";

        init(userName, host, password, port, command);
        try {
            byte[] tmp = new byte[1024];
            while (true) {
                while (is.available() > 0) {

                    int i = is.read(tmp, 0, 1024);
                    if (i < 0) break;
                    returnString += new String(tmp, 0, i);

                }
                if (channel.isClosed()) {
                    if (is.available() > 0) continue;
                    returnString += "exit-status:" + channel.getExitStatus();
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception ee) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnString;

    }

    private static void close() throws IOException {
        is.close();
        channel.disconnect();
        session.disconnect();
    }

    private static void init(String userName,
                             String host,
                             String password,
                             String port,
                             String command) {
        jSch = new JSch();
        try {
            session = jSch.getSession(
                    userName,
                    host,
                    Integer.parseInt(port));
            session.setPassword(password);
            session.setUserInfo(new MyUserInfo());
            session.setConfig("StrictHostKeyChecking", "no");

            session.connect(30000);

            channel = session.openChannel("exec");

            ((ChannelExec) channel).setCommand(command);
            ChannelSftp channelSftp;


            channel.setInputStream(null);
            ((ChannelExec) channel).setErrStream(System.err);

            is = channel.getInputStream();
            channel.connect();
        } catch (JSchException | IOException e) {
            e.printStackTrace();
        }


    }

    private static class MyUserInfo implements UserInfo {
        @Override
        public String getPassphrase() {
            System.out.println("getPassphrase");
            return null;
        }

        @Override
        public String getPassword() {
            System.out.println("getPassword");
            return null;
        }

        @Override
        public boolean promptPassword(String s) {
            System.out.println("promptPassword:" + s);
            return false;
        }

        @Override
        public boolean promptPassphrase(String s) {
            System.out.println("promptPassphrase:" + s);
            return false;
        }

        @Override
        public boolean promptYesNo(String s) {
            System.out.println("promptYesNo:" + s);
            return true;//notice here!
        }

        @Override
        public void showMessage(String s) {
            System.out.println("showMessage:" + s);
        }
    }
}
