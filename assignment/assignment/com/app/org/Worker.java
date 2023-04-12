package assignment.com.app.org;

public class Worker extends Employee{

    private int hoursWorked;
     private double ratePerHour;
    public Worker (int id,String name, String deptId, double basic,int hoursWorked,double ratePerHour)
    {
        super(id, name, deptId, basic);
        this.hoursWorked=hoursWorked;
        this.ratePerHour=ratePerHour;

    }

    public double computeNetSalary()
    {
        return getBasic()+(this.hoursWorked*this.ratePerHour);

    }

    public String toString()
    {
        return "Worker Details :" +"id="+getId()+" name= "+getName()+"  deptId ="+getDeptId()+" basic= "+getBasic()+" hourse Worked"+hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
}
