package annotation;


import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

@ClassPreamble()
public class Test {
    @ClassPreamble
    public static void myMethods(){

    }
    public static void main(String[] args) throws NoSuchMethodException {
        Test test = new Test();
        Method method = test.getClass().getMethod("myMethods");
        Annotation[] annotations = method.getAnnotations();
        ClassPreamble myitem =  method.getAnnotation(ClassPreamble.class);
        for(Annotation a: annotations){
            System.out.println(a);

        }

        System.out.println(myitem.name());
        System.out.println(myitem.pageSize());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface ClassPreamble {
    String name() default "V545460";
    String pageSize() default "10";
}


