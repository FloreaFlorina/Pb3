import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * [create type description]
 */
public class CarTest {

    private  Car greenCar;

    @Before
    public  void createCar(){

        greenCar = new Car(100,2);

    }

    @Test
    public void testAllMilesDriven() {
        boolean carDriving = greenCar.turnOnAndDrive(25);
        boolean carbrokedDown = greenCar.isBrokenDown();
        assertEquals(carbrokedDown,!carDriving);
    }

    @Test
    public void testSomeMilesDriven() {

        assertFalse(greenCar.turnOnAndDrive(100));
    }

    @Test

    public void testGas(){

        greenCar.repair();
        greenCar.fillGas(5);
        assertEquals(7,greenCar.getGas(),0.01);
    }

    @Test

    public void testMiles(){

        assertEquals(100,greenCar.getMileage(),0.01);

    }






}