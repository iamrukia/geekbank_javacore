package ocp.exam.guide.chap10.whichrunaable;

public class WhichRunnable {

    public static void main(String[] args) {
        MyRClass myRClass = new MyRClass();
        MyTClass myTClass = new MyTClass(myRClass);
        Thread thread = new Thread(myRClass);

        myTClass.start();
        thread.start();

    }
}

class MyRClass implements Runnable{


    @Override
    public void run() {
        System.out.println("runnable class");
    }
}

class MyTClass extends Thread{

    public MyTClass(Runnable runnable){
        super(runnable);
    }
    public void run(){
        System.out.println("thread class");
    }
}
