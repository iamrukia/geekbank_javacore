package ocp.exam.guide.chap6.old.nongeneric;

import java.util.ArrayList;
import java.util.List;

public class TestBadLegacy {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(6);
        Inserter in = new Inserter();
        in.insert(myList);
    }
}

class Inserter {
    void insert(List list) {
        list.add(new String("42"));
    }
}
