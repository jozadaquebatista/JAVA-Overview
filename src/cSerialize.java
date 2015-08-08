import java.io.FileOutputStream;

public class cSerialize
{

  public static void main(String[] args)
  {
  
    String[] names = {"Jozadaque", "Antonio", "Luzia", "Carlos"};
    
     FileOutputStream fos = new FileOutputStream("/tmp/objeto.ser");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     
     oos.writeObject(names);
     oos.close();
    
  }

}