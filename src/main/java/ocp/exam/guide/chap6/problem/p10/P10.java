package ocp.exam.guide.chap6.problem.p10;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class P10 {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.add("2");
        ad.add("4");
        System.out.println(ad.peek());

        ad.offer("1");

        ad.add("3");
        ad.remove();
        System.out.println(ad.poll() + " ");

        if (ad.peek().equals("2")) System.out.println(ad.poll() + " ");
        System.out.println(ad.poll() + " " + ad.peek());

        System.out.println("hi");
    }
}
