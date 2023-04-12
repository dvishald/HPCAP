package day4.inheritence;

public class BMW extends Car{

    BMW (){
       // super("blue");
        System.out.println(" from bmw constructor ");
    }

    @Override
    public void engineCapacity() {

        System.out.println("2000cc");
    }

    public void changeColor(){

        color="Blue";
        System.out.println("Color of  Bmw is  "+color);
    }
}
