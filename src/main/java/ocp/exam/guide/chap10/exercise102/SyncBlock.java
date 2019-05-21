package ocp.exam.guide.chap10.exercise102;

public class SyncBlock extends Thread {

    private StringBuffer stringBuffer;

    public SyncBlock(StringBuffer sb) {
        stringBuffer = sb;
    }

    @Override
    public void run() {

        doStuff();
    }

    private void doStuff() {
        synchronized (stringBuffer) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuffer);
            }
            stringBuffer.setCharAt(0, (char) (stringBuffer.charAt(0) + 1));
        }
    }
}
