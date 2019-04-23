package tiku.p014;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Bird{
    public void fly(){
        System.out.println("Can fly");
    }
}
class Penguin extends Bird{
    public void fly(){
        System.out.println("Can not fly");
    }
}
public class P14 {
    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);
    }


    //<? extends Bird> can be replaced as <Bird>
    static void fly(Supplier<? extends Bird> bird) {
        bird.get().fly();
    }
}
