package collections.framework.learn;

public class SortedSetDemo {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ) {
            String from = String.valueOf(ch++);
            String to = String.valueOf(ch);
            System.out.println(from + ": " + to);
        }
    }
}
