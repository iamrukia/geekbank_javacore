package ocp.exam.guide.chap2.problem.p11;

import org.apache.velocity.tools.generic.ClassTool;

interface MyInterface {
    static int staticInterfaceMethod() {
        return 1;
    }
    static String p = "hi";
}

class Alpha {
    static String s = "";
    static int staticClassMethod() {
        return 1;
    }
    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha implements MyInterface{
    private SubAlpha() {
        s += "sub ";
        staticClassMethod();
    }
}

public class SubSubAlpha extends Alpha implements MyInterface{
    private SubSubAlpha() {
        s+= "subsub";
        staticClassMethod();

    }
    public static int staticInterfaceMethod(){
        return 2;
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);

    }
}
