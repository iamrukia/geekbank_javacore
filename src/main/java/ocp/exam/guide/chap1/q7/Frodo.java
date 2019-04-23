package ocp.exam.guide.chap1.q7;

public class Frodo extends Hobbit{
    public static void main(String[] args) {
        int mygold = 7;
        //System.out.println(this.countGold(mygold,6));
    }
}
class Hobbit{
    int countGold(int x, int y){
        return x + y;
    }
}
