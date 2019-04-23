package ocp.exam.guide.chap6.problem.p12;

import java.util.LinkedHashSet;

public class TurtleTest {
    public static void main(String[] args) {
        LinkedHashSet<Turtle> t = new LinkedHashSet<>();
        t.add(new Turtle(1));
        t.add(new Turtle(2));
        t.add(new Turtle(1));

        System.out.println(t.size());
    }
}

class Turtle {
    int size;

    public Turtle(int s) {
        size = s;
    }

    public boolean equals(Object o) {
        return (this.size == ((Turtle) o).size);
    }
}
