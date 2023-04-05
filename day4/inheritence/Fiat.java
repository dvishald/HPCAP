package day4.inheritence;

public class Fiat extends Car{

    Fiat(){
        System.out.println("from Fiat Car constructor ");
    }

    public void changeColor(){
        color="White";

        System.out.println("color of fiat is "+color);
    }
}
