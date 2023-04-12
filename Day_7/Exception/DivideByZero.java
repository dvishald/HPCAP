package Day_7.Exception;

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int first= sc.nextInt();

        System.out.println("Enter second number");
        int second= sc.nextInt();

        // traditional way of checking

//        if(second!=0)
//            System.out.println(first/second);
//        else
//            System.out.println("Cannot be divide by zero");
//
        try{
            System.out.println(first/second);
            System.out.println("Work done");

        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("Work end");
    }


}
