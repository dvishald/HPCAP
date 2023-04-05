package Day_2;

public class TestEmployee {
    public static void main(String[] args) {
//
//        Employee e=new Employee(101,"Vishal",80000);
//        System.out.println(e);
//
//
//        Employee e2=new Employee(654,"bhai",69000);
//        System.out.println(e2);
//        Employee e3=new Employee(321,"oop",85000);
//        System.out.println(e3);
//        Employee e4=new Employee(984,"bull",55000);
//        System.out.println(e4);
//        Employee e5=new Employee(654,"king",95000);
//        System.out.println(e5);
        int i;

        Employee EArray[]= new Employee[5];
        EArray[0]=new Employee(45,"King",1000);
        EArray[1]=new Employee(73,"Teja",200);
        EArray[2]=new Employee(38,"Vishal",800);
        EArray[3]=new Employee(783,"abhi",87000);
        EArray[4]=new Employee(152,"ap",87000);

//        System.out.println(EArray[0]);
//        System.out.println(EArray[1]);
//        System.out.println(EArray[2]);
//        System.out.println(EArray[3]);
//        System.out.println(EArray[4]);
       // System.out.println(EArray[5]);

        System.out.println("Base Salary");
        for (i=0;i<EArray.length;i++)
        {
            System.out.println(EArray[i]);
        }

//        EArray[2].salary=EArray[2].salary+100;
//        System.out.println(EArray[2]);
//        EArray[4].salary+=300;
//        System.out.println(EArray[4]);
//       //  EArray[0].


        for (i=0;i<EArray.length;i++){
            if(EArray[i].salary<=1000){
                EArray[i].salary+=500;
            }

        }
        System.out.println("Salary After Increment");
        for (i=0;i<EArray.length;i++)
        {
            System.out.println(EArray[i]);
        }
    }
}
