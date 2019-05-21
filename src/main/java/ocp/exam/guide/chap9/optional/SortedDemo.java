package ocp.exam.guide.chap9.optional;

import org.apache.velocity.util.DuckType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        Stream.of("Jerry", "George", "Kramer", "Elaine")
                .sorted()
                .forEach(System.out::println);

        Comparator<Dog> byName = Comparator.comparing(Dog::getName);
        Comparator<Dog> byColor = Comparator.comparing(Dog::getColor);
        Comparator<Dog> byAge = Comparator.comparing(Dog::getAge);

        List<Dog> dogs = Arrays.asList(
                new Dog("Jerry", "yellow", 3),
                new Dog("George", "brown", 4),
                new Dog("Kramer", "mottled", 6),
                new Dog("Elaine", "white", 2),
                new Dog("Jerry", "brown", 11)
        );


        dogs.stream().sorted(byName.thenComparing(byAge).thenComparing(byColor)).forEach(System.out::println);

        List<Dog> dogs1 = new ArrayList<>();
        dogs1.add(new Dog("good", "yes", 3));
        dogs1.add(new Dog("good", "yes", 3));
        dogs1.add(new Dog("good", "yes", 3));
        dogs1.add(new Dog("good", "yes", 3));
        dogs1.add(new Dog("good", "yes", 3));

        Dog[] dogs2 = dogs1.toArray(new Dog[0]);
        dogs2[0] = new Dog("bad", "no", 3);

        System.out.println("hi");

        dogs.stream()
                .map(d -> d.getColor())
                .distinct()
                .forEach(System.out::println);
    }
}
