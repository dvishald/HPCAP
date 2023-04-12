package assignment.com.customer;

import assignment.com.app.vehicle.exception.DuplicateVehicalException;
import assignment.com.customerExceptions.DuplicateCustomerException;
import assignment.com.customerExceptions.UnderAgeCustomerException;

public class CustomerOperation {

    Customer customerArray[]= new Customer[5];
    int top=-1;


    public void addCustomer(Customer customer) throws  DuplicateCustomerException ,UnderAgeCustomerException{

        if (top == -1) {

            customerArray[++top]=customer;
        }


        else if(customer.equals(customerArray[top])){
                throw new DuplicateCustomerException("Customer Already Exists ");

        }
        else if (customer.getAge()<=customerArray[top].getAge()) {
            throw  new UnderAgeCustomerException("You are not Eligible due to you are less than 18") ;

        }
    }

    public void login(String email,String password){
        int i;
        for (i=0;i<=top;i++){
            if (customerArray[i].getEmail().equals(email) && customerArray[i].getPassword().equals(password)) {

                System.out.println(" Wel-Come "+customerArray[i].getName());
                return;
            }
        }
        if(i==top){
            System.out.println("Invalid  email or password!!!!!!!!!!!");
        }
    }


}
