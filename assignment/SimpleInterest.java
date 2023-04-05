package assignment;


public class SimpleInterest {

   public static double SimpleInterestA( double p,float r, float t)
   {
       double simpleIntrest=(p*r*t)/100;
       return simpleIntrest ;

    }

    public static double compoundInterest(double p,double r,double t)
    {
        double compoundInterest=1;
        double interest= 1+(r/100);

        for (int i=0;i<t;i++)
        {
            compoundInterest*=interest;
        }
        compoundInterest*=p;


        return compoundInterest;
    }

    public static void main(String[] args) {

        System.out.println(SimpleInterestA(15000,5,2));

        System.out.println( "compound interest is :"+ compoundInterest(15000,5,2));

        System.out.println( "compound interest is :"+ compoundInterest(15000,6,3));

    }



    

}
