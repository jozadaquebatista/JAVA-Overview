import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.List;
import java.util.LinkedList;

public class Interators
{

  public static void main(String[] args)
  {
  
    List<String> names = new LinkedList<String>();
    
    names.add("Jhon");
    names.add("Joana");
    names.add("Lucas");
    names.add("Mariana");
    names.add("Paulo");
    
    // Then we catch the List with interator.
    Iterator<String> Names = names.iterator();
    
    while(Names.hasNext())
    {
      System.out.println(Names.next());
    }
  }

}