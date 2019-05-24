package ocp.exam.guide.chap11.problem.p14;

public class Leader implements Runnable {
    @Override
    public void run() {
        System.out.println("r1");
        System.out.println("r2");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Leader());
        t.start();
        System.out.println("m1");
        t.join();
        System.out.println("m2");
    }
}
