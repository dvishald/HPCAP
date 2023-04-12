package assignment.com.app.vehical;

import day3.Employee;

public class Vehical {

    String  regNo;
    String color;
    double price;

    public Vehical(String regNo, String color, double price) {
        this.regNo = regNo;
        this.color = color;
        this.price = price;
    }

    public String toString
            (){
        return  this.regNo+" "+this.color+" "+price;
    }

    public boolean equal(Object o){
        return  this.regNo. equals(((Vehical)o).regNo);
    }
}
