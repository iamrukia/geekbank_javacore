package ocpexam.javaclassdesign.cloneasasuperclass;

import java.util.Arrays;

public class CloneDemo {
    public static void main(String[] args) {
        int[][] intArray = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                intArray[i][j] = 3;
            }
        }

        int[][] newArray = intArray.clone();

        newArray[1][1] = 2;

        // the change on cloned array has changed the original array too
        // this is due to the clone method is not a deep copy
        System.out.println(intArray[1][1]);
        System.out.println(newArray[1][1]);



    }
}
