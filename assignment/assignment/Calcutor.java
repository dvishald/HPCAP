package assignment;

import java.util.Scanner;

public class Calcutor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       // System.out.println("select action");

        while (true)
        {
            System.out.println("Select Action");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division");

            System.out.println("5.Modulous  ");
            System.out.println("6. Exit");
            int action= sc.nextInt();

            switch (action)
            {
                case 1:{
                    System.out.println("Enter first number :");
                    int n1= sc.nextInt();
                    System.out.println("Enter Second Number");
                    int n2= sc.nextInt();
                    System.out.println("Addition :"+(n1+n2));

                    break;
                }
                case 2:{

                    System.out.println("Enter first number :");
                    int n1= sc.nextInt();
                    System.out.println("Enter Second Number");
                    int n2= sc.nextInt();
                    System.out.println("Subtraction :"+(n1-n2));

                    break;
                }

                case 3:
                {
                    System.out.println("Enter first number :");
                    int n1= sc.nextInt();
                    System.out.println("Enter Second Number");
                    int n2= sc.nextInt();
                    System.out.println("Result :"+(n1*n2));

                    break;
                }

                case 4:{
                    System.out.println("Enter first number :");
                    int n1= sc.nextInt();
                    System.out.println("Enter Second Number");
                    int n2= sc.nextInt();
                    System.out.println("Result :"+(n1/n2));



                    break;
                }
                case 5:
                {
                    System.out.println("Enter first number :");
                    int n1= sc.nextInt();
                    System.out.println("Enter Second Number");
                    int n2= sc.nextInt();
                    System.out.println("Result :"+(n1%n2));

                    break;
                }

                default:{
                    System.out.println("please select proper Choice");
                }
            }
            if (action==6){
                break;
            }
        }

    }
}
