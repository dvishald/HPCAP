package assignment;
import java.util.Scanner;

public class SquareRoot {

    public static double min(double num) {
        for(int i=0 ; ;i++){
            if(i*i==num){
                return i;
            } else if (i*i>num) {
                return i-1;

            }
        }



    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number");
        double ip=s.nextDouble();
        double min=min(ip);

      //  System.out.println(min);
        double max =min+1;
        double avg ;
        if (min*min==ip)
       {
            System.out.println(min);
       }
       else
       {
            avg=(min+max)/2;
           while(true)
           {
                if(avg*avg==ip)
               {
                    System.out.println(avg);
                    break;
               }
               else if(avg*avg>ip)
                {
                    max=avg;
                }
                else if (avg*avg<ip)
                {
                    min=avg;
                }
                avg =(max+min)/2;
           }
       }

    }

}
