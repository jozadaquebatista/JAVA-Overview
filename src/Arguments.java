import java.lang.*;

public class Arguments
{

  public static void main(String[] args)
  {
    try {
      
      if(args[0] != null)
        System.out.println("Olá " + args[0] + " você usou este programa corretamente.");
    
    } catch(Exception e) {
    
      System.err.println("Usage: java program [args]. \nSorry try again.");      
    
    }
  }
}