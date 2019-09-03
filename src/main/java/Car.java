/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

import java.util.Random;

/**
 * [create type description]
 */
public class Car implements Drive {

    private static final int MILES_PER_GALLON = 25;

    private double milesDriven;
    private double gas;
    private boolean brokenDown;

    public Car(final double milesDriven, final double gas) {
        this.milesDriven = milesDriven;
        this.gas = gas;
        this.brokenDown = false;
    }

    public boolean turnOnAndDrive(double milestToDrive) {
        if (this.brokenDown) return false;
        if (isCarBreakingDown()) return false;
        return enoughGasGallons(milestToDrive); }

    public boolean isCarBreakingDown(){

        Random random = new Random();
        if(random.nextInt(100)+1 <= getBreakDownChance()){ this.brokenDown = true;
            return true; }
        return false; }

        public boolean enoughGasGallons(double milestToDrive){
        double gallonsNeeded = milestToDrive/MILES_PER_GALLON;
        if(gallonsNeeded <= this.gas){
            this.gas -=  gallonsNeeded;
            this.milesDriven += milestToDrive;
            return true;
        }
        this.milesDriven += this.gas * MILES_PER_GALLON;
        this.gas = 0.0 ;
        return false; }

    public int getBreakDownChance() {
        return  (((int)(milesDriven - 1)/10000 + 1)*10);
    }
    public double getMileage() { return this.milesDriven; }
    public boolean isBrokenDown() { return this.brokenDown; }
    public void repair() { this.brokenDown = false; }
    public void fillGas(final double numberOfGallons) { this.gas +=  numberOfGallons; }
    public double getGas() { return this.gas; }





}
