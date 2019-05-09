package ocp.exam.guide.chap6.make.own.genericclass;

import java.util.ArrayList;
import java.util.List;

public class TestRental {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        List<Car> carList = new ArrayList<Car>();
        carList.add(c1);
        carList.add(c2);

        RentalGeneric<Car> carRentalGeneric = new RentalGeneric<Car>(2, carList);

        // now get a car out, and it won't need a cast
        Car carToRent = carRentalGeneric.getRental();


        carRentalGeneric.returnRental(carToRent);

        // can we stick somthing else in the original carList?
        //carList.add(new Cat("fluffy"));
    }
}
