package Day_7;

public class GCTest {

    public static void main(String[] args) throws Throwable {
        GCTest gcTest= new GCTest();


        System.out.println(gcTest);

        System.out.println("Before GC");
        Runtime.getRuntime().gc();

        gcTest.finalize();

        gcTest=null;
        System.out.println("After GC");

        Runtime.getRuntime().gc();

    }

    protected void finalize()   {
        System.out.println("infinalized ");
    }
}
