package Day_7.Exception;

public class FinallyBlock {
    public static void main(String[] args) {


        try{

            System.out.println(20/0);
            System.out.println(20/5);
        }catch (ArithmeticException e)
        {
           // e.printStackTrace();
          //  System.out.println("/ By Zero ");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("from Finally Block");
        }
    }
}
