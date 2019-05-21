package ocp.exam.guide.chap10.threadsafe;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
    private List<String> names = Collections.synchronizedList(new LinkedList<>());

    public void add(String name) {
        names.add(name);
    }

    public String removeFirst() {
        if (names.size() > 0) {
            return (String) names.remove(0);
        } else {
            return null;
        }
    }
}
