package assignment;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//         int n = sc.nextInt();
//
//
//
//        int low = 1;
//        int high = n;
//        int mid = (low + high) / 2;
//
//        while (low <= high) {
//
//
//                if (mid * mid == n) {
//                    System.out.println("square root of number is :" +mid);
//                }
//
//                else if (mid * mid < n) {
//                    low = mid + 1;
//
//                }
//                else {
//                }
//            high  =mid-1;
//        }

        System.out.println(sqrt(9));


        System.out.println("Square root of "+" is " +Math.sqrt(9));
    }

    public static double sqrt(int n)
    {

        int low = 1;
        int high = n;
        int mid = (low + high) / 2;

        while (low < high) {


            if (mid * mid == n) {
                //System.out.println("square root of number is :" +mid);
                return mid;
            }

            else if (mid * mid < n) {
                low = mid + 1;

            }
            else {
            }
            high  =mid-1;
        }
        return mid;

    }
}