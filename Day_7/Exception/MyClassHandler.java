package Day_7.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClassHandler {
    public static void main(String[] args) {

        System.out.println("Before A Called");
        new MyClassHandler().doA();
        System.out.println("After Called A");

    }

    public void doA(){
        System.out.println("Before B Called");
        doB();
        System.out.println("After B Called");
    }

    public void doB(){
        System.out.println("Before C Called");

        try {
            doC();
        }catch (MyCustomException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("After C Called");
    }

    public void doC()throws MyCustomException{
        System.out.println("Before D Called");
        doD();
        System.out.println("After D Called");
    }

    public void doD() throws MyCustomException  {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println(sc.nextInt());
       }
        catch (InputMismatchException e)
        {
            throw new MyCustomException("I/P Missing Exception");
        }

    }
}
