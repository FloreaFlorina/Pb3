/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

/**
 * [create type description]
 */
public class Main {

    public static void main(String[] args) {

        CarTester carTest = new CarTester();
        for(int i=0; i<=5;i++) {
            System.out.println(carTest.testCar());
        }
    }
}
