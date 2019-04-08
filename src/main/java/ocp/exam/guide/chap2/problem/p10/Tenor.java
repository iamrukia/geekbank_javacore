package ocp.exam.guide.chap2.problem.p10;

class Singer{
    public static String sing(){return "la";}
}
public class Tenor extends Singer{
    public static String sing() {return "fa";}

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();

        System.out.println(t.sing());
        System.out.println(s.sing());
    }
}
