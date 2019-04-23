package ocp.exam.guide.chap2;


interface FrogBoilable{
    static int getCtoF(int cTemp){
        return cTemp + 32;
    }

    default String hop() {
        return "hopping";
    }
}
public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }

    void go(){
        System.out.println(hop());
        //System.out.println(DontBoilFrogs.getCtoF(10));
    }
}
