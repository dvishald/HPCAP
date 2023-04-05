package Day_2;

public class NonStaticDemo {

    {

        System.out.println("From Non Static Block ");
    }

    static
    {
        System.out.println("From Static Block");
    }
      public NonStaticDemo(){

          System.out.println("From Constructor");
      }
}
