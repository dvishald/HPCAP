package Day_7.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenricException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= null;
        System.out.println("Enter number");


                try {
                    System.out.println(sc.nextInt());
                }catch (InputMismatchException ime){
                    System.out.println("InputMismatchException Occured ");

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
    }
}
