package assignment.com.app.vehicle.tests;

import assignment.com.app.vehicle.VehicalOperation;
import assignment.com.app.vehicle.Vehicales;
import assignment.com.app.vehicle.exception.DuplicateVehicalException;

public class TestVehicles {
    public static void main(String[] args)throws DuplicateVehicalException {

        VehicalOperation vo= new VehicalOperation();

        Vehicales v1= new Vehicales("mh123",4637,"black");
        vo.printVehicleDetails();
        vo.addVehical(v1);

       // vo.addVehical(v1);
        Vehicales v2= new Vehicales("mh123",4637,"black");
        vo.addVehical(v2);
        vo.printVehicleDetails();
        Vehicales v3= new Vehicales("mh12445",4637,"black");


    }

}
