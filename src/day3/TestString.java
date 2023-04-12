package day3;

public class TestString

{
    public static void main(String[] args) {
        String s1="Vishal";

        String s2= "Vishal";

        if (s2==s1){
            System.out.println("==Equals");  //compare ref
        }
        else {
            System.out.println("==Mot Equal");
        }

        if (s1.equals(s2)){
            System.out.println("Equals");      //compare values
        }
        else {
            System.out.println("not equals");
        }

        String s3=new String("Vishal");

        if (s2==s3){
            System.out.println("==Equals");  //compare ref
        }
        else {
            System.out.println("==Mot Equal");
        }

        if (s1.equals(s3)){
            System.out.println("Equals");      //compare values
        }
        else {
            System.out.println("not equals");
        }


    }
}
