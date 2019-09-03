/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

/**
 * [create type description]
 */
public class CarTester {

    public double testCar(){
        Car car1 = new Car(0,10);
        double milesToDrive = 10;
        while(true){
            if(car1.turnOnAndDrive(milesToDrive)){
                milesToDrive+=10 ;

            }
            else if(!car1.isBrokenDown()) {
                car1.fillGas(10);
            }
            else
                return car1.getMileage();
        }
    }
}
