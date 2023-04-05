package day3;

public class TestEquals {

    public static void main(String[] args) {

        Integer int1= new Integer(5);
        Integer int2= new Integer(5);
        Double dub=new Double(23.33);
        String s1= new String("Dash");

        System.out.println(int1.equals(int2));
        System.out.println(int1.equals(s1));

        System.out.println(s1.equals(dub));


    }
}
