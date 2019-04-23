package ocp.exam.guide.chap2.problem.p16;

interface MyInterface {
    default int doStuff() {
        return 42;
    }
}

public class InterfaceTest implements MyInterface {
    public int doStuff() {
        return 43;
    }

    public static void main(String[] args) {
        new InterfaceTest().go();
    }

    void go() {
        System.out.println(doStuff());

//        System.out.println(super.doStuff());
        System.out.println(MyInterface.super.doStuff());
//        System.out.println(super.MyInterface.doStuff());
//        System.out.println(MyInterface.doStuff());
    }
}
