package assignment.com.app.vehicle;

public class Vehicales {
    private String regNumber;
    private float price;
     private String color;

    public Vehicales(String regNumber, float price, String color) {
        this.regNumber = regNumber;
        this.price = price;
        this.color = color;
    }


    @Override
    public boolean equals(Object obj) {
        return this.regNumber.equals(((Vehicales)obj).regNumber);
    }

    public String toString(){

        return "Reg Number : "+regNumber+" Price : "+price+" Color : "+color;
    }
}
