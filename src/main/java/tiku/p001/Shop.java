package tiku.p001;

public class Shop {
    private Cake c = new Cake();
    private final double discount = 0.25;

    public void makeReady(){c.bake(10,120);}
}
