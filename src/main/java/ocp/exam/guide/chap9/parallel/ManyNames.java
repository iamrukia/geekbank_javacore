package ocp.exam.guide.chap9.parallel;

public class ManyNames {
    public static void main(String[] args) {
        Runnable nr = () -> {
            for (int x = 1; x <= 400; x++) {
                System.out.println(
                        "Run by " + Thread.currentThread().getName() + ", x is " + x
                );
            }
        };


        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
}
