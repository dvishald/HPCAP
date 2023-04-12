package assignment.employeeStack;

public class FixedStack implements Stack{
    int size=4;
    Employee[] eFixed=new Employee[size];

    int top=-1;


    @Override
    public void push(Employee e) {

        if (top<(size-1)){
            top++;
            eFixed[top]= e;
        }
        else {
            System.out.println("Stack Overflow (full)");
        }
    }

    @Override
    public Employee pop() {

        Employee popValue=null;
        if(top==-1){
            System.out.println("Stack Under Flow (empty)");
        }
        else{
            popValue= eFixed[top];
            eFixed[top]=null;
            top--;
        }
        return popValue;
    }
}
