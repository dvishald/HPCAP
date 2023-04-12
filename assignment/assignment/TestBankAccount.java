package assignment;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount[]bankAccounts= new BankAccount[4];
        BankAccount b1= new BankAccount(123123123,"teja", 2000d);
        BankAccount b2= new BankAccount(12341234,"Vishal",2500d);
        BankAccount b3=new BankAccount(1234567891,"Ganya",1500d);
        BankAccount b4=new BankAccount(12389688,"dongre",1640d);

        //BankAccount b5=new BankAccount(134569872,"Ravan",800d);
        bankAccounts[0]=b1;
        bankAccounts[1]=b2;
        bankAccounts[2]=b3;
        bankAccounts[3]=b4;

        for (int i=0; i< bankAccounts.length;i++){                                //for print details

            System.out.println("Your account details are; "+bankAccounts[i]);
        }

        b1.withdraw(1000);
        b2.withdraw(1700);

    }
}
