import java.util.Set; // Interface
import java.util.List;// Interface
import java.util.Queue;// Interface
import java.util.Map;// Interface

// [ COLLECTIONS ]
import java.util.LinkedHashSet; // class that implements interface Set
import java.util.LinkedList; // class that implements interface List
import java.util.PriorityQueue; // class that implements interface 

// [ NO COLLECTION ]
import java.util.HashMap;

public class sayThanksToCollections
{

  public static void main(String[] args)
  {
    /* We have main interfaces in collections that are very useful*/
    
    Set<String> set = new LinkedHashSet<>();
    List<String> list = new LinkedList<>();
    Queue<String> queue = new PriorityQueue<>();
    
    Map<String, String> map = new HashMap<>();
    
    // And that is all you've to know, and don't forget to say tanks that useful resources!!! :D 
  }

}