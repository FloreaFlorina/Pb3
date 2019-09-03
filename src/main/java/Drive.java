/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

/**
 * [create type description]
 */
public interface Drive {


    public boolean turnOnAndDrive(double milestToDrive);

    public double getMileage();

    public boolean isBrokenDown();

    public void repair();

    public void fillGas(double numberOfGallons);

    public double getGas ();
}




