package assignment.com.app.vehicle;

import assignment.com.app.vehicle.exception.DuplicateVehicalException;

public class VehicalOperation {
    Vehicales vehicalesArray[]= new Vehicales[5];
    private int top=-1;
    public void addVehical(Vehicales vehicales){

        if (top==-1){
            vehicalesArray[++top]=vehicales;
        }
        else {
            try{
                for(int i=0;i<=top;i++){
                    if(vehicales.equals(vehicalesArray[i])){
                        throw new DuplicateVehicalException("Duplicate Vehicle Found ");
                    }

                    else {
                        vehicalesArray[++top]=vehicales;
                        break;
                    }
                }
            }
            catch (DuplicateVehicalException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void printVehicleDetails(){
        for(int i=0;i<=top;i++){
            System.out.println(vehicalesArray[i]);
        }

    }
}
