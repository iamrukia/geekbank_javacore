package ocp.exam.guide.chap9.collector;

public class Person {
    String name;
    Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String toString() {
        return name + " is " + age + " years old.";
    }
}
