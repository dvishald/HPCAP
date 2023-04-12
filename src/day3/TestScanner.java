package day3;

import java.util.Scanner;

public class TestScanner {



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");

        int num= sc.nextInt();

        System.out.println("Enter a name");
        String name= sc.next();

        System.out.println(name);
        System.out.println(num);
//        int a=4;
//        String res= a%2==0?"Even Number":"Odd Number";
    }
}
