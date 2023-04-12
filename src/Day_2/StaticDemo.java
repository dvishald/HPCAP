package Day_2;

public class StaticDemo {

    static int i=10;
    int j=30;
    public StaticDemo ()
    {
        System.out.println("from constructor A");
    }
    static
    {
        System.out.println("Staic A Initializer");
    }
}
