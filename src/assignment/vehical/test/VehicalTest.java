package assignment.vehical.test;

import assignment.com.app.vehical.Vehical;

public class VehicalTest {
    public static void main(String[] args) {


        Vehical v=new Vehical("mh24k6617","Black",30000);
        Vehical v2= new Vehical("mh24k9617","blue",35500);
        if (v.equal(v2)){
            System.out.println("Duplicate Vehical ");
        }

        else {
            System.out.println("unique vehical");
        }
    }
}
