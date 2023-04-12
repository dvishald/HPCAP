package assignment;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){

            System.out.println("Please Select From choice Below\n 1. Veg\n 2.Non-Veg \n 3. Exit");
            int menu= sc.nextInt();
            switch (menu) {

                case 1: {

                    System.out.println("you selected veg\n please select Dish \n 1. Panir Tikka\n 2.Shev Bhaji\n3.Mashrum\n4.veg kolhapuri");
                    int veg= sc.nextInt();


                    switch (veg){
                        case 1:
                        {
                            System.out.println("you selected panir tikka \n cost per plate is 180rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (180*qty));
                            System.out.println("Anything you Want");
                            break;
                        }

                        case 2:{

                            System.out.println("you selected Shev Bhaji \n cost per plate is 150rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (150*qty));
                            System.out.println("Anything you Want");

                            break;

                        }

                        case 3:{

                            System.out.println("you selected Mashrum\n cost per plate is 210rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (210*qty));
                            System.out.println("Anything you Want");
                            break;
                        }
                        case 4:{
                            System.out.println("you selected veg kolhapuri \n cost per plate is 160rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (160*qty));
                            System.out.println("Anything you Want");
                            break;
                        }

                    }
                    break;

                }

                case 2:{

                    System.out.println("you selected Non-Veg\n please select Dish \n 1. Chicken Biryani\n 2.Chicken keema\n3.Tangdi Kabab\n4.Tandoori Chicken");
                    int nonVeg= sc.nextInt();
                    switch (nonVeg){
                        case 1:{

                            System.out.println("you selected Chicken Biryani \n cost per plate is 200rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (200*qty));
                            System.out.println("Anything you Want");
                            break;
                        }
                        case 2:{
                            System.out.println("you selected Chicken Keema \n cost per plate is 190rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (190*qty));
                            System.out.println("Anything you Want");
                            break;
                        }
                        case 3:{
                            System.out.println("you selected Tangdi Kabab \n cost per plate is 220rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (220*qty));
                            System.out.println("Anything you Want");
                            break;
                        }
                        case 4:{
                            System.out.println("you selected Tandoori Chicken \n cost per plate is 260rs \n how much you want ");
                            float qty= sc.nextFloat();
                            System.out.println("your bill is : "+ (260*qty));
                            System.out.println("Anything you Want");
                            break;
                        }

                    }
                    break;



                }


            }
            if(menu==3){
                break;
            }

        }

    }
}
