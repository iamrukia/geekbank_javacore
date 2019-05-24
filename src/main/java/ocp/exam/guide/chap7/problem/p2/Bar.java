package ocp.exam.guide.chap7.problem.p2;

class Boo {
    Boo(int a) {
    }

    Boo() {
    }

    public Boo(String x) {
    }
}

public class Bar extends Boo {
    public static void main(String[] args) {
        Boo x1 = new Boo() {
            int i = 0;
        };

        Boo x2 = new Boo("x") {
            String y = "x";
        };
    }
}
