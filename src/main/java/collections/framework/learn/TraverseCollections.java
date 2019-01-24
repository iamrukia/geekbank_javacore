package collections.framework.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TraverseCollections {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            stringList.add(String.valueOf(i));
        }
        System.out.println(stringList);
        //Aggregate Operations
        String newString = stringList.parallelStream().map(Object::toString).collect(Collectors.joining("="));
        System.out.println(newString);


        //iterator remove
        filter(stringList);
        System.out.println(stringList);

        //to array
        String[] a = stringList.toArray(new String[0]);
        System.out.println(a);

    }

    //iterator remove
    static void filter(Collection<?> c) {
        for (Iterator<?> it = c.iterator(); it.hasNext(); )
            if ((Integer.parseInt(String.valueOf(it.next())) % 7 != 0))
                it.remove();
    }


}
