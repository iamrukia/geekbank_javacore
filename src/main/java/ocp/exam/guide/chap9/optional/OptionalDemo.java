package ocp.exam.guide.chap9.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Dog boi = new Dog("hello", "good", 4);


        boi = null;

        Optional<Dog> optionalDog = Optional.ofNullable(boi);


        Optional<Dog> emptyDog = Optional.empty();
        if (!emptyDog.isPresent()) {
            System.out.println("Empty dog must be empty");
        }

        List<Dog> dogs = new ArrayList<>();

        dogs.stream().filter(d -> d != null).findAny();

    }
}
