package ocp.exam.guide.chap1.overrideoverload;

public class Horse extends Animal {
    public String eat(int x,int y){
        System.out.println("horse eat");
        return "hi";
    }
}
