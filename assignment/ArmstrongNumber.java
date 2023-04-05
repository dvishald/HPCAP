package assignment;
import java.util.Scanner;
public class ArmstrongNumber {


    public static  double count(int n)
    {
        int count=0;
        int temp=n;
        for (int i=temp;i>0;i/=10){

            int rem=i/10;

            count++;

        }

        return count;
    }

    public static void main(String[] args) {
        //System.out.println(count(1234));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        double rem,arm=0;
        for (double i=num;i>0;i/=10){

            rem=i%10;

            arm+=Math.pow(rem,count(num));

        }

        if (num==arm)
        {
            System.out.println("armstrong number ");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
