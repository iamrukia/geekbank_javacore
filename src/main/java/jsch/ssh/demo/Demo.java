package jsch.ssh.demo;

public class Demo {
    public static void main(String[] args) {
        String s = SshUtil.executeSSHCommand(
                "pi",
                "192.168.0.25",
                "*****",
                "22",
                "ls -ltr"
        );
        System.out.println(s);
    }
}
