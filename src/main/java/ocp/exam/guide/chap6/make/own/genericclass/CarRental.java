package ocp.exam.guide.chap6.make.own.genericclass;

import java.util.List;

public class CarRental extends Rental {
    public CarRental(int maxNum, List rentalPool) {
        super(maxNum, rentalPool);
    }
    public Car getRental(){
        return (Car) super.getRental();
    }

    public void returnRental(Car c){
        super.returnRental(c);
    }

    public void returnRental(Object o){
        if(o instanceof Car){
            super.returnRental(o);
        } else {
            System.out.println("Cannot add a non-car");
            // probably throw an exception
        }
    }
}
