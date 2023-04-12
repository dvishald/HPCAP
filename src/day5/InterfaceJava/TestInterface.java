package day5.InterfaceJava;

public class TestInterface {

    public static void main(String[] args) {

        IFly ifly= new Superman();
        ifly.fly();
        System.out.println(IFly.speed);

        ifly=new Parrot();
        ifly.fly();

        ifly=new Aeroplane();
        ifly.fly();

    }
}
