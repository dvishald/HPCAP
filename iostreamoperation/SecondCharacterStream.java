package iostreamoperation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecondCharacterStream {

    public static void main(String[] args) {

        try(FileReader inputStream= new FileReader("Read.txt");
            FileWriter outputStream = new FileWriter("Write.txt")) {
            char[] buffer= new char[10];

            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer,0,read);
            }
        }catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}
