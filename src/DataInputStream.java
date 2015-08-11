    /*
      Read boolean from file using DataInputStream
      This Java example shows how to read a Java boolean primitive value from file using
      readBoolean method of Java DataInputStream class.
    */
     
    import java.io.DataInputStream;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
     
    public class ReadBooleanFromFile {
     
      public static void main(String[] args) {
     
        String strFilePath = "C://FileIO//readBoolean.txt";
       
        try
        {
          //create FileInputStream object
          FileInputStream fin = new FileInputStream(strFilePath);
         
          /*
           * To create DataInputStream object, use
           * DataInputStream(InputStream in) constructor.
           */
         
           DataInputStream din = new DataInputStream(fin);
         
           /*
            * To read a Java boolean primitive from file, use
            * byte readBoolean() method of Java DataInputStream class.
            *
            * This method reads one byte from file and returns true if byte is nonzero,
            * false if the byte is zero.
            */
           
            boolean b = din.readBoolean();
           
            System.out.println("boolean : " + b);
           
            /*
             * To close DataInputStream, use
             * void close() method.
             */
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
