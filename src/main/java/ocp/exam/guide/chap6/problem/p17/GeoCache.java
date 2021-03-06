package ocp.exam.guide.chap6.problem.p17;

import java.util.Arrays;
import java.util.Comparator;

public class GeoCache {
    public static void main(String[] args) {
        String[] s = {"map", "pen", "marble", "key"};

        Othello o = new Othello();
        Arrays.sort(s, o);
        for (String s2 : s) System.out.print(s2 + " ");
        System.out.println("");

        System.out.println(Arrays.binarySearch(s,"map"));

        //use the same comparator during sort
        System.out.println(Arrays.binarySearch(s,"key",o));
    }

    static class Othello implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}


