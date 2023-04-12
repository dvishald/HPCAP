package assignment.com.app.org.tester;
import java.util.Scanner;

import assignment.com.app.org.Employee;
import assignment.com.app.org.Manager;
import assignment.com.app.org.Worker;

public class TestOrganization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //   System.out.println("============");

        Employee e[]= new Employee[8];

        Employee m1= new Manager(1,"teja","det1",5000,100);

        Employee m2= new Manager(2,"kimg","det01",5000,100);
        Employee m3= new Manager(3,"raja","det02",5000,100);
        Employee m4= new Manager(4,"vishal","det03",5000,200);

        Employee w1=new Worker(5,"mayur","dept04",2000,2,200);
        Employee w2=new Worker(6,"raj","dept05",2000,2,200);
        Employee w3=new Worker(7,"suraj","dept06",2000,2,200);
        Employee w4=new Worker(8,"kamlesh","dept07",2000,2,200);

        e[0]=m1;
        e[1]=w1;
        e[2]=m2;
        e[3]=m3;
        e[4]=m4;
        e[5]=w2;
        e[6]=w3;
        e[7]=w4;


        for (Object elements:e) {
            System.out.println(elements);

        }


    // System.out.println(e[0]);
        //  int choice=sc.nextInt();
//        while (true) {
//            System.out.println("select option from below \n1.hire manager\n2.hire worker\n3.display details\n4.update \n5.exit");
//            switch (choice){
//                case 1:
//                {

//
//                    break;
//                }
//                case 2:
//                {
//
//                    break;
//                }
//                case 3:
//                {
//                    break;
//                }
//                case 4:
//                {
//                    break;
//                }
//                default:{
//                    System.out.println("please select proper choice");
//                }
//
//            }
//
//            if(choice==5){
//                System.exit(0);
//
//            }
//        }


    }
}
