package ocpexam.javaclassdesign.polymorphism;

public class Demo {
    public static void main(String[] args) {
        Animal animala = new Animal();
        Animal animalb = new Dog();
        Dog animalc = new Dog();

        System.out.println(animala.bark());

        /**
         * Error:(10, 35) java: cannot find symbol
         *   symbol:   method newmethod()
         *   location: variable animalb of type ocpexam.javaclassdesign.polymorphism.Animal
         */
        System.out.println(((Dog) animalb).newmethod());
        System.out.println(animalc.newmethod());
    }
}
