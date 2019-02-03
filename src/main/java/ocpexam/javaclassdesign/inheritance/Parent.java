package ocpexam.javaclassdesign.inheritance;

public class Parent {
    public int publicField = 1;
    protected int protectedField = 1;
    private int privateField = 1;

    private int publicField2 = 2;

    public int getPublicField() {
        return publicField;
    }

    protected int getProtectedField(){
        return protectedField;
    }

    private int getPrivateField(){
        return privateField;
    }
}
