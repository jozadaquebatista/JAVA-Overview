import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class cSetCollection
{

  public static void main(String[] args)
  {
  
    /*
    *  Note: The <SET> interface don't let objects have duplicate values
     */
  
    // Array of primitive type
    String[] cores = {"violet", "purple", "black", "black", "white", "green", "pink", "yellow", "blue", "red"};
  
    System.out.println(cores[1]);
    
    // Array of Type interface List
    List<String> list = Arrays.asList(cores);
    
    // This give us a Exception, whatever, the program will be executed
    try
    {
    
      list.add("white"); 
    
    }catch(Exception e){}
    finally{
    
      System.out.println(list);
      
      Set<String> set = new HashSet<>(list);
      
      System.out.println("\nLIST with non-duplicated values: \n" + set);
      
    }
    
  }

}