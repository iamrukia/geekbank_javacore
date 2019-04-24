package ocp.exam.guide.chap6.sort;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3};
        Arrays.sort(intArray,(one,two) -> one.compareTo(two));
    }
}
