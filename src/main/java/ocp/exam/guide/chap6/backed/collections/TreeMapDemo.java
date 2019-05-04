package ocp.exam.guide.chap6.backed.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");
        map.put("g", "goat");
        map.put("b", "bee");

        SortedMap<String, String> submap;
        submap = map.subMap("b", "g");

        System.out.println(map + " " + submap);

        map.put("b", "bat");
        submap.put("f", "fish");

        map.put("r", "raccoon");

        System.out.println(map + " " + submap);
    }
}
