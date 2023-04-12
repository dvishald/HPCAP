package assignment;

public class Stack {

   private final int size=5;
    private  int iArray[]=new int [size];
    int top=-1;


    void push(int a){

        if (top<(size-1)){
            top++;
            iArray[top]= a;
        }
        else {
            System.out.println("Stack Overflow (full)");
        }

    }

    int pop(){

        int popValue=0;
        if(top==-1){
            System.out.println("Stack Under Flow (empty)");
        }
        else{
            popValue= iArray[top];
            iArray[top]=0;
            top--;
        }
        return popValue;
    }
}
