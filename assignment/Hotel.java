package assignment;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){

            System.out.println("Please Select From choice Below\n 1. Veg\n 2.Non-Veg");
            int menu= sc.nextInt();
            switch (menu) {

                case 1: {

                    System.out.println("you selected veg\n please select Dish \n 1. Panir Tikka\n 2.Shev Bhaji\n3.Mashrum\n4.veg kolhapuri");
                    break;

                }

                case 2:{

                    System.out.println("you selected Non-Veg\n please select Dish \n 1. Panir Tikka\n 2.Shev Bhaji\n3.Mashrum\n4.veg kolhapuri");

                    break;

                }


            }

        }

    }
}
