package ocpexam.javaclassdesign.polymorphism;

public class Dog extends Animal {
    @Override
    public String bark() {
        return "this is Dog";
    }

    public String newmethod(){
        return "new method";
    }
}
