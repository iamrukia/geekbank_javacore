package tiku.p001;

public class Bread extends Cake {
    //public void bake(int minutes, int temperature){}
    public void addToppings(){}

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.bake(10, 120);

        StringBuilder mysb = new StringBuilder("abcdefg");
        mysb.replace(1,2,"z");
        System.out.println(mysb);
        mysb.replace(0,1,"y");
        System.out.println(mysb);
        mysb.replace(7,9,"x");
        System.out.println(mysb);


    }
}
