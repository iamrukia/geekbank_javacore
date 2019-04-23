package ocp.exam.guide.chap6.problem.p16;

import java.util.TreeSet;

class Dog {
    int size;

    Dog(int s) {
        size = s;
    }
}

public class FirstGrade {
    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<Integer>();
        TreeSet<Dog> d = new TreeSet<>();

        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));

        i.add(1);
        i.add(2);
        i.add(1);

        System.out.println(d.size());
        System.out.println(i.size());
    }
}
