package Day_7;

import java.util.Scanner;

public class Feeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I love you");
        System.out.println("please reply");

        String str= sc.next();

        System.out.println(str.length());

      //  System.out.println("y= yes\n n=no");
        char reply =sc.next().charAt(0);

        switch (reply){
            case 'y':{
                System.out.println("I love you too!!!!!!");
                break;
            }
            case 'n':
            {
                System.out.println("I Hate you ");
                break;
            }
            default:{
                System.out.println("WE Are Just friends ?");
            }

        }

    }
}
