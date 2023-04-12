package assignment;

public class BankAccount {
   private long acc_no;
    private String name;
     private final String ifsc="SBIN0012480";
    private Double balance;


    public BankAccount(long acc_no, String name, Double balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;

        if (balance<1000){
            System.out.println("Cannot Create Account due to minimum balance required is 1000 RS");
        }
        else {
            System.out.println("Account created successfully");
        }
    }


    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIfsc() {
        return ifsc;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public  void deposit(double bal)
    {
        this.balance+=bal;
        System.out.println("deposit successful your acc balance is:"+this.balance);
    }

    public void withdraw(double bal){


        if (this.balance-bal>=1000){
            this.balance-=bal;
            System.out.println("remaining balance is: "+this.balance);

        }
        else {
            System.out.println("Insufficient balance");
        }

    }

    public String toString(){
        return acc_no+" "+name+" "+ifsc+" "+balance;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return this.balance==Object.
//    }
}
