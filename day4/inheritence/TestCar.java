package day4.inheritence;

public class TestCar {

    public static void main(String[] args) {


        Car c=new Car();
        BMW bmw=new BMW();
        Fiat f= new Fiat();

        bmw.engineCapacity();      //2000cc;

        f.engineCapacity();   //  1300

        bmw.changeColor();    // blue
        f.changeColor();     //white



    }

}
