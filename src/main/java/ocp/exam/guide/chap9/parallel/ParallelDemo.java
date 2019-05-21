package ocp.exam.guide.chap9.parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //nums.add(11);

        System.out.println((nums.parallelStream()
                .mapToInt(n -> n)
                .sum()));

    }
}
