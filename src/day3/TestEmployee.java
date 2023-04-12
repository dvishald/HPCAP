package day3;

public class TestEmployee {
    public static void main(String[] args) {


        Employee e=new Employee();

        e.setEid(1);
        e.setName("Ravan");
        e.setSalary(100000);

        Employee e1=new Employee();

        e1.setEid(1);
        e1.setName("Ravan");
        e1.setSalary(100000);


        System.out.println(e.equals(e1));

        System.out.println("Name = "+e.getName());
        System.out.println("Id = "+e.getEid());
        System.out.println("Salary = "+e.getSalary());
    }
}
