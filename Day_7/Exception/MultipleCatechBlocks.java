package Day_7.Exception;

import java.util.Scanner;

public class MultipleCatechBlocks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        String s = null;
        try {
            System.out.println(first / second);
            System.out.println(s.length());
            System.out.println("Work done");

        } catch (ArithmeticException | NullPointerException ae) {
            System.out.println(ae.getMessage());
        }
        System.out.println("Work end");
    }
}
