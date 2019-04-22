package collections.framework.learn;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        String[] myArray = new String[3];

        myArray[0] = "A";
        myArray[1] = "B";
        myArray[2] = "C";


        List<String> myList = Arrays.asList(myArray);

        System.out.println("myArray " + myArray);
        System.out.println("myList " + myList);

        myList.add("hi");

    }
}
