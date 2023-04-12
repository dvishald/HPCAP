package assignment.com.app.org;

public class Manager extends Employee{

    private double pBonous;
public Manager(int id, String name,String deptId,double basic,double pBonus){

      super(id, name, deptId, basic);
      this.pBonous=pBonus;

   }

    public double computeNetSalary()
    {
        return getBasic()+this.pBonous;

    }

    public String toString(){
      return "Manager Details : "+"id="+getId()+" name= "+getName()+"  deptId ="+getDeptId()+" basic= "+getBasic()+" Performance Bonus= "+getpBonous();
   }

    public double getpBonous() {
        return pBonous;
    }

    public void setpBonous(double pBonous) {
        this.pBonous = pBonous;
    }
}
