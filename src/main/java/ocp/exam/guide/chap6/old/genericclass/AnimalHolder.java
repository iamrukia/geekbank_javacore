package ocp.exam.guide.chap6.old.genericclass;

public class AnimalHolder<T extends Animal> {
    T animal;

    public static void main(String[] args) {
        AnimalHolder<Dog> dogHolder = new AnimalHolder<Dog>();   // OK
        //AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO
    }
}
