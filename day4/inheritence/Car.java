package day4.inheritence;

import assignment.Calcutor;

public class Car {

    public String color="red";
    public Car(){                       //parameter less constructor

        System.out.println("Car Class Constructor ");
    }

    public Car(String color){           //parametrized constructor

        this.color=color;
        System.out.println("Color of Car is :"+color);
    }

    public void engineCapacity(){
        System.out.println("1300cc");
    }


}
