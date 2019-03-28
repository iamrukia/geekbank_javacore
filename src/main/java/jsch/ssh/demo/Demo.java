package jsch.ssh.demo;

import com.jcraft.jsch.*;

import java.io.IOException;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) {

        try {
            JSch jSch = new JSch();
            Session session = jSch.getSession(
                    "pi",
                    "192.168.0.25",
                    22);

            session.setPassword("S.nbfg");
            UserInfo userInfo = new UserInfo() {
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
            };

            session.setUserInfo(userInfo);
            session.setConfig("StrictHostKeyChecking", "no");

            session.connect(30000);

            Channel channel = session.openChannel("exec");

            ((ChannelExec) channel).setCommand("ls");

            channel.setInputStream(null);
            ((ChannelExec) channel).setErrStream(System.err);

            InputStream is = channel.getInputStream();
            channel.connect();


            byte[] tmp = new byte[1024];
            while (true) {
                while (is.available() > 0) {

                    int i = is.read(tmp, 0, 1024);
                    if (i < 0) break;
                    System.out.println(new String(tmp, 0, i));

                }
                if(channel.isClosed()){
                    if(is.available()>0) continue;
                    System.out.println("exit-status:" + channel.getExitStatus());
                    break;
                }
                try{
                    Thread.sleep(1000);
                }catch ( Exception ee){}
            }
            channel.disconnect();
            session.disconnect();

        } catch (JSchException | IOException e) {
            e.printStackTrace();
        }
    }
}
