package Day_7.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws Exception{


        Date currentDAte= new Date();
        System.out.println(currentDAte);


        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");
        String stringDate="15/06/1999";
        Date parseDate= sdf.parse(stringDate);

        System.out.println(parseDate);
    }
}
