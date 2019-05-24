package ocp.exam.guide.chap7.problem.p8;

class A {
    void m() {
        System.out.println("outer");
    }
}

public class TestInners {
    public static void main(String[] args) {
        new TestInners().go();
    }

    void go() {
        new A().m();
        class A {
            void m() {
                System.out.println("middle");
            }
        }
    }

    class A {
        void m() {
            System.out.println("middle");
        }
    }
}
