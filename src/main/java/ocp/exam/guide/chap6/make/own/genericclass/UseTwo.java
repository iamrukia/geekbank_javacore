package ocp.exam.guide.chap6.make.own.genericclass;

public class UseTwo<T, U> {
    T one;
    U two;

    UseTwo(T one, U two) {
        this.one = one;
        this.two = two;
    }

    T getT() {
        return one;
    }

    U getU() {
        return two;
    }

    public static void main(String[] args) {
        UseTwo<String, Integer> twos = new UseTwo<>("foo", 42);

        String theT = twos.getT();
        int theU = twos.getU();
    }
}
