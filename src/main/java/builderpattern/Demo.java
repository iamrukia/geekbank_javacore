package builderpattern;

public class Demo {
    public static void main(String[] args) {
        People people = new People.Builder("nan").build();

        System.out.println("builder pattern");
    }
}
