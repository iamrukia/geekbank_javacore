package ocp.exam.guide.chap2;

public class StaticDemo {
    public static void doIt(){
        System.out.println("doIt Static");
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.Hello();
    }
    public static void doItAgain(){
        System.out.println("doItAgain");
    }

    public void Hello(){
        System.out.println("hello");
        doItAgain();
    }

    public static void main(String[] args) {
        doIt();

        StaticDemo staticDemo = new StaticDemo();
        staticDemo.Hello();

    }
}
