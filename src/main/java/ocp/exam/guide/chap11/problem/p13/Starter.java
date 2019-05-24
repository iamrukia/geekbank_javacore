package ocp.exam.guide.chap11.problem.p13;

public class Starter implements Runnable {
    void go(long id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId());
        //new Starter().run();
        //new Starter().start();
        //new Thread(new Starter());
        //new Thread(new Starter()).run();
        new Thread(new Starter()).start();
    }

    @Override
    public void run() {
        go(Thread.currentThread().getId());
    }
}
