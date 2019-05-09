package ocp.exam.guide.chap6.make.own.genericclass;

public class X {
    public <X> X (X x){
        System.out.println("hi");
        System.out.println(x.toString());
    }
}
