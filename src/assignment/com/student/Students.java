package assignment.com.student;

public class Students {

   private String prn_no;
    private String name;
   private String email;
   private String password;
   private double gpa;
    Students (){}  //default constructor

    public Students(String prn_no, String name, String email, String password, double gpa) {
        this.prn_no = prn_no;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gpa = gpa;
    }


    public String getPrn_no() {
        return prn_no;
    }

    public void setPrn_no(String prn_no) {
        this.prn_no = prn_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
