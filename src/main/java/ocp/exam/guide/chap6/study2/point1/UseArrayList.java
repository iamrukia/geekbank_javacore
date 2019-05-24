package ocp.exam.guide.chap6.study2.point1;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int x = 4;
        int y = 5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(x);
        list.add(y);
        list.add(Integer.valueOf(x));
        list.add(new Integer(y));

        System.out.println(list);

        //
        int i = list.get(0);
        Integer ii = list.get(0);

        list.forEach(System.out::print);
        list.forEach( e -> System.out.println(e));
    }
}
