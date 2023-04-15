package Day_7.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dates2 {
    public static void main(String[] args) throws ParseException {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the date");
        String date= sc.next();

        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");

        Date parseDate = sdf.parse(date);

        System.out.println(parseDate);
      //  System.out.println("Entered date is "+sdf.format(date));        // only displays date without extra info //

    }
}





