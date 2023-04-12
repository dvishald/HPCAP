package Day_2;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println(StaticDemo.i);


      //  System.out.println(StaticDemo.j);      //Error
        StaticDemo a=new StaticDemo();
        System.out.println(a.j);
    }
}
