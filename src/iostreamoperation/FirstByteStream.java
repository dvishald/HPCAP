package iostreamoperation;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstByteStream {
    public static void main(String[] args) {


        try(FileInputStream inputStream= new FileInputStream("Read.txt");
            FileOutputStream outputStream = new FileOutputStream("Write.txt");)
        {
            int read;
            while ((read=inputStream.read())!=-1){
                outputStream.write(read);
               //System.out.println("file successfull read");
            }
        }
        catch (IOException e){
            System.out.println("Error "+e.getMessage());


        }
    }
}
