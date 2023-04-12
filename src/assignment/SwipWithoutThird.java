package assignment;

public class SwipWithoutThird
{
    public static void main(String[] args) {
        int i=20;
        int j=30;
        i=i+j;
        j =i-j;
        System.out.println("j="+j);
        i=i-j;
        System.out.println("i="+i);
    }
}
