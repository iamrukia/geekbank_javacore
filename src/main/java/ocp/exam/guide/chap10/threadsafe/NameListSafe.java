package ocp.exam.guide.chap10.threadsafe;

import java.util.ArrayList;
import java.util.List;

public class NameListSafe {
    private List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized String removeFirst() {
        if (names.size() > 0) {
            return (String) names.remove(0);
        } else {
            return null;
        }
    }
}
