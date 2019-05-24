package ocp.exam.guide.chap6.old.genericclass;

public class X {
    public <X> X (X x){
        System.out.println("hi");
        System.out.println(x.toString());
    }
}
