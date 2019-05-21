package ocp.exam.guide.chap9.collector;


import builderpattern.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void main(String[] args) {
        Person beth = new Person("Beth", 30);
        Person eric = new Person("eric", 31);
        Person deb = new Person("deb", 32);
        Person liz = new Person("liz", 33);
        Person wendi = new Person("wendi", 34);
        Person bkathy = new Person("bkathy", 33);
        Person bert = new Person("bert", 32);
        Person bill = new Person("bill", 31);
        Person robert = new Person("robert", 30);
        Person luke = new Person("luke", 34);

        List<Person> people = new ArrayList<>();
        people.add(beth);
        people.add(eric);
        people.add(deb);
        people.add(liz);
        people.add(wendi);
        people.add(bkathy);
        people.add(bert);
        people.add(bill);
        people.add(robert);
        people.add(luke);


        List<Person> peropleAge34 = people.stream()
                .filter(p -> p.getAge() == 34)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(peropleAge34);

        Map<Integer, Long> hi = people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        Map<Integer, List<String>> ok = people.stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(
                                        Person::getName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println(hi);
        System.out.println(ok);
    }
}
