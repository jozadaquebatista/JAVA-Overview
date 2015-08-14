
import java.io.*;
     
public class ReadStringFromFile {
     
  public static void main(String[] args) {
      
    File file = new File("/tmp/ReadString.txt");
     
    int ch;
    StringBuffer strContent = new StringBuffer("");
    FileInputStream fin = null;
       
    try
    {
        
      fin = new FileInputStream(file);
        
          
         
      while( (ch = fin.read()) != -1)
        strContent.append((char)ch);
     
          
        fin.close();
         
      }
      catch(FileNotFoundException e)
      {
        System.out.println("File " + file.getAbsolutePath() +
                                 " could not be found on filesystem");
      }
      catch(IOException ioe)
      {
        System.out.println("Exception while reading the file" + ioe);
      }
       
      System.out.println("File contents :");
      System.out.println(strContent);
       
       
        
  }
}
