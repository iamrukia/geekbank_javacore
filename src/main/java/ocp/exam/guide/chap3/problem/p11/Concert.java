package ocp.exam.guide.chap3.problem.p11;

public class Concert {
    static class PowerOutage extends Exception{}
    static class ThunderStorm extends Exception{}

    public void listen() throws PowerOutage, ThunderStorm{}


    public static void main(String[] args) {
        try{
            new Concert().listen();
            System.out.println("a");
        }catch( PowerOutage | ThunderStorm e){
            //e = new PowerOutage();
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
    }
}
