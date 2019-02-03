package ocpexam.javaclassdesign.inheritance;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

    /**
     * The inherited fields can be used directly, just like any other fields.
     * You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
     * You can declare new fields in the subclass that are not in the superclass.
     * The inherited methods can be used directly as they are.
     * You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
     * You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
     * You can declare new methods in the subclass that are not in the superclass.
     * You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
     */

    public static void main(String[] args) throws ClassNotFoundException {


        // point 1 - The inherited fields can be used directly, just like any other fields.
        Parent parent = new Parent();
        Child child = new Child();

        parent.protectedField = 10;
        System.out.println(child.protectedField);

        // point 2 - You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
        Class c = Class.forName("ocpexam.javaclassdesign.inheritance.Child");
        Method[] methods = c.getMethods();
        Field[] fields = c.getDeclaredFields();

        for (Field f : fields) {
            System.out.println(f.toString());
        }

        Class c2 = Class.forName("ocpexam.javaclassdesign.inheritance.Parent");
        Method[] methods2 = c2.getMethods();
        Field[] fields2 = c2.getFields();

        for (Field f : fields2) {
            System.out.println(f.toString());
        }
    }
}
