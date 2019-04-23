package ocp.exam.guide.chap2.problem.p7;

class Dog{
    public void bark(){
        System.out.println("bark");
    }
}

class Hound extends Dog{
    public void bark(){
        System.out.println("howl");
    }
    public void sniff(){
        System.out.println("sniff");
    }
}
public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    private void go() {
        new Hound().bark();
        ((Dog)new Hound()).bark();

        //((Dog) new Hound()).sniff();
        /**
         * compiler can tell error during compile time
         */
    }
}
