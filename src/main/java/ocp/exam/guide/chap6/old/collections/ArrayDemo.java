package ocp.exam.guide.chap6.old.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");

        String[] myArray = myList.toArray(new String[0]);

        myList.add("hi");
        System.out.println("myList: " + myList);
        for (String item: myArray)
            System.out.println("myArray: " + item);
    }
}
