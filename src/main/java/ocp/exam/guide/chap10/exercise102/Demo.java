package ocp.exam.guide.chap10.exercise102;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("A");
        SyncBlock a = new SyncBlock(sb);
        SyncBlock b = new SyncBlock(sb);
        SyncBlock c = new SyncBlock(sb);
        a.start();
        b.start();
        c.start();
    }

}
