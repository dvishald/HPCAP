package assignment.com.customer;

public class Customer {
    private String name;
    private String email;
    private  String password;
    private int age;
    double registrationAmount;


    public Customer(String name, String email, String password, int age, double registrationAmount) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.registrationAmount = registrationAmount;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRegistrationAmount() {
        return registrationAmount;
    }

    public void setRegistrationAmount(double registrationAmount) {
        this.registrationAmount = registrationAmount;
    }


    @Override
    public boolean equals(Object obj) {
        return email.equals(((Customer)obj).email);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", registrationAmount=" + registrationAmount +
                '}';
    }
}


