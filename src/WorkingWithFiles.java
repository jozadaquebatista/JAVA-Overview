import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithFiles // Copying Bytes
{

    static public void main(String[] args) throws IOException
    {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
          
          /*
          * This program catches content of a file and write over another file.
           */
        
            in = new FileInputStream("inputFileTest.txt");
            out = new FileOutputStream("outputFileTest.txt");
            int c;

            // This part checks if the reading reached the final of file
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
