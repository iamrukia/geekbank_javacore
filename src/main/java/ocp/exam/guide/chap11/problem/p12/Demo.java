package ocp.exam.guide.chap11.problem.p12;

public class Demo {
    public static void main(String[] args) {

        try {
            int x = 0;
            throw new Exception("hi");
        } catch (Exception e) {
            System.out.println("lol");
            System.out.println(e.getMessage());
        }
        System.out.println("out");
    }
}
