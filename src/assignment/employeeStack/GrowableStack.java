package assignment.employeeStack;

public class GrowableStack  implements Stack{
    int size=2;

    int top=-1;
    Employee eGrowable[]=new Employee[size];

    int count=0;
    @Override
    public void push(Employee e) {

        while (true) {
            if (top < (size - 1)) {
                eGrowable[count] = e;
                top++;
                count++;

            } else {

                System.out.println("Stack get full ...");
                Employee tempEmployee[] = new Employee[size];

                tempEmployee = eGrowable;

                eGrowable = new Employee[2 * eGrowable.length];
                for (int i = 0; i < tempEmployee.length; i++) {
                    eGrowable[i] = tempEmployee[i];

                }
                eGrowable[count] = e;
                count++;
            }
        }

    }

    @Override
    public Employee pop() {
        Employee popValue=null;
        if(top==-1){
            System.out.println("Stack Under Flow (empty)");
        }
        else{
            popValue= eGrowable[top];
            eGrowable[top]=null;
            top--;
        }
        return popValue;
    }
}
