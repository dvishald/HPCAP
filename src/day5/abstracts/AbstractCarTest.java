package day5.abstracts;

import day5.abstracts.BMW;
import day5.abstracts.Car;

public class AbstractCarTest {
    public static void main(String[] args) {


        //Car c= new Car();   Cannot instantiate Abstract class
        BMW bmw= new BMW();

        bmw.doSomething();
        bmw.doNothing();
    }
}
