package ocp.exam.guide.chap11.problem.p1;

public class P1 {
    public static void main(String[] args) {
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
