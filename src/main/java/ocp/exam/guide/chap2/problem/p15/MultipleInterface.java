package ocp.exam.guide.chap2.problem.p15;

interface I1{
    default int doStuff(){return  1;}
}

interface I2{
    default int doStuff() {return  2;}
}
public class MultipleInterface implements I1, I2{
    /**
     * without public on this method, there will be compilor error about access modifier gets smaller (public ->  blank)
     * also, if doStuff does not exist, then clashes of inherited method will compile error
     * @return
     */
    public int doStuff(){
        return 3;
    }

    void go() {
        System.out.println(doStuff());
    }

    public static void main(String[] args) {
        new MultipleInterface().go();
    }
}
