package tiku.p020;

public class Coin {
    public enum USCurrency {
        PENNY(1),
        NICKLE(5),
        DIME(10),
        QUARTER(25);


        private final int value;

        USCurrency(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

    }


    public static void main(String[] args) {
        USCurrency usCoin = USCurrency.NICKLE;
        USCurrency usCoin2 = USCurrency.DIME;
        System.out.println(usCoin.getValue());
    }
}
