package iostreamoperation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class firstCharacterstream {

    public static void main(String[] args) {

        try(FileReader inputStream= new FileReader("Read.txt");
            FileWriter outputStream = new FileWriter("Write.txt"))
        {

          int read;
          while ((read=inputStream.read())!=-1){
              outputStream.write(read);
          }




        }
        catch (IOException e)
        {
            e.getMessage();
            e.printStackTrace();
        }


    }
}
