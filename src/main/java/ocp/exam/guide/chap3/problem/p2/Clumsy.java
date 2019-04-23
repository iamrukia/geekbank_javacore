package ocp.exam.guide.chap3.problem.p2;

public class Clumsy {
    public static void main(String[] args) {
        int j = 7;
        assert(j > 10):j = 12;


        System.out.println(j);
    }
}
