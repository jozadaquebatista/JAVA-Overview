import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class fileInputStream
{

    public static void main(String[] args) throws IOException
    {
    
        FileOutputStream outputstream = new FileOutputStream("/tmp/file.img");
        FileInputStream inputstream = new FileInputStream("/tmp/file.img");
        
        try {
            
            int data = inputstream.read();
            
            while(data != -1){
                System.out.print( (char)data );
                data = inputstream.read();
            }
            
        } finally { 
        
            inputstream.close();
            outputstream.close();
        }
    
    }

}
