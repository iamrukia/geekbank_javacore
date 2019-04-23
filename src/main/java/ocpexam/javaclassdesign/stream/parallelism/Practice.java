package ocpexam.javaclassdesign.stream.parallelism;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();


        // Executing Streams in Parallel
        double average = roster
                .parallelStream()
                .filter(person -> person.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println("Executing Streams in Parallel: average age = " + average);

        // Concurrent Reduction
        Map<Person.Sex, List<Person>> byGender = roster
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));
        System.out.println(byGender.toString());

        // parallel equivalent
        ConcurrentMap<Person.Sex, List<Person>> byGenderParallel = roster
                .parallelStream()
                .collect(Collectors.groupingByConcurrent(Person::getGender));



    }
}
