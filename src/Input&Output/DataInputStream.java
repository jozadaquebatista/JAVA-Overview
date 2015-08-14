import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
     
public class ReadBooleanFromFile {
     
  public static void main(String[] args) {
     
    String strFilePath = "C://FileIO//readBoolean.txt";
       
    try
    {
      FileInputStream fin = new FileInputStream(strFilePath);
         
      DataInputStream din = new DataInputStream(fin);
         
      boolean b = din.readBoolean();
           
      System.out.println("boolean : " + b);
           

      din.close();
           
    }
    catch(FileNotFoundException fe)
    {
      System.out.println("FileNotFoundException : " + fe);
    }
    catch(IOException ioe)
    {
      System.out.println("IOException : " + ioe);
    }
  }
}
