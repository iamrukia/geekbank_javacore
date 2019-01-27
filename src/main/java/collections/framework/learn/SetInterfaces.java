package collections.framework.learn;

import java.util.*;

public class SetInterfaces {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            stringList.add(String.valueOf(i));
        }

        //conversion by conversion constructor
        Collection<String> noDupsHashSet = new HashSet<String>(stringList);
        Collection<String> noDupsTreeSet = new TreeSet<String>(stringList);
        Collection<String> noDupsLinkedHashSet = new LinkedHashSet<String>(stringList);


        // no guarantee the order for hashset
        System.out.println(noDupsHashSet);

        // order is guaranteed and based on value (string value here)
        System.out.println(noDupsTreeSet);

        // order is based on insertion order
        System.out.println(noDupsLinkedHashSet);

    }
}
