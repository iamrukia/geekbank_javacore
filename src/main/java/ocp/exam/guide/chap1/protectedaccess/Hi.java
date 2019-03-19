package ocp.exam.guide.chap1.protectedaccess;

import ocp.exam.guide.chap1.protectedaccessa.Hey;

public class Hi extends Hey {
    public static void main(String[] args) {
        Hey hey = new Hey();
        Hi hi = new Hi();
        System.out.println(hi.b);
    }
}
