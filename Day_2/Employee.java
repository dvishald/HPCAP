package Day_2;

public class Employee {
    int eid;
    String name;
    double salary;

    Employee(){}

    Employee(int eid, String name, double salary)
    {
        this.eid=eid;
        this.name=name;
        this.salary=salary;
    }

    public String toString()
    {
        return "employee details are: "+eid +" "+name+" "+salary;
    }

}
