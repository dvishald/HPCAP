package day3;

public class Employee {

    private int eid;
   private String name;
   private double salary;

    Employee(){}

//    Employee (int id,String name){
//
//        this.eid=id; * Strings are constant; their values cannot be changed after they

//        this.name=name;
//    }
//

    public void setEid(int id ){
        this.eid=id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

   public int getEid(){
        return this.eid;
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }


    public String toString(){
        return "Employee Details : "+eid+" "+name+" "+salary;
    }

    @Override

    public  boolean equals(Object obj){

        return this.eid==((Employee)obj).eid &&this.name.equals(((Employee)((Employee) obj)).name)&&this.salary==((Employee)((Employee) obj)).salary;
    }
}
