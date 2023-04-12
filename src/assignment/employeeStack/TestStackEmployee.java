package assignment.employeeStack;

public class TestStackEmployee {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Vishal",10000);
        Employee e2=new Employee(2,"Teja",21000);
        Employee e3=new Employee(3,"goti",15000);
        Employee e4=new Employee(4,"raja",3200);
        Employee e5=new Employee(5,"madame",34000);


        Stack s1= new FixedStack();
        s1.push(e1);
        s1.push(e2);
        s1.push(e3);
      //  s1.push(e4);


        for(int i=0;i<4;i++) {
            System.out.println(s1.pop());
        }


  s1.pop();


       Stack s2= new GrowableStack();
       // s2.push(e1);
        // s2.push(e2);
         //s2.push(e3);



    }
}
