package assignment.com.app.org;

public class Employee {
    private int id;
    private String name;
   private String deptId;

   private double basic;

    public Employee(int id,String name, String deptId, double basic) {
        this.id=id;
        this.name = name;
        this.deptId = deptId;
        this.basic = basic;
    }

    public double computeNetSalary(){ return 0;}


    public String toString(){
        return  "id="+id+" name= "+name+"  deptId ="+deptId+" basic= "+basic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
}
