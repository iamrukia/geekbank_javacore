package ocpexam.javaclassdesign.stream;

import java.util.ArrayList;

public class ReduceDemo {

    public static void main(String[] args) {
        ArrayList<Integer> roster = new ArrayList<>();
        roster.add(1);
        roster.add(2);
        roster.add(100);

        Integer totalAge = roster
                .stream()
                .mapToInt(Integer::byteValue)
                .sum();

        System.out.println(totalAge);
    }
}
