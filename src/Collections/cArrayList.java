import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class cArrayList
{

  public static void main(String[] args)
  {
  
    List<String> users = new ArrayList<String>();
    
    users.add("Manuel");
    users.add("Lucas");
    users.add("Pedro");
    users.add("Marcos");
    users.add("Joaquim");
    
    Iterator it = users.iterator();
    
    
    while(it.hasNext())
    {
    
      System.out.println(it.next());
    
    }
    
  }

}