package assignment;

public class Recusriv {

    static void hello( String s,int a)
    {
      if (a>0){
          System.out.println(s);
          a-=1;

      }

      else {
          return;
      }
        hello(s,a);


    }

    public static void main(String[] args) {
       hello("Vishal",5);
    }
}