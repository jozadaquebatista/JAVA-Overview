import java.util.Collection;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class HashCode
{

  public static void main(String[] args)
  {
  
    // Very Basic Methods of Collection Interface
  
    List<String> list = new LinkedList<>();
    List<String> otherList = new LinkedList<>();
    
    list.add("Jozadaque");
    list.add("Augusto");
    list.add("Paulo");
    
    otherList.add("Joana");
    otherList.add("Lucia");
    otherList.add("Luana");
    
    list.addAll(otherList); // This adds all elements of another list :D
    
    System.out.println(list);
    System.out.println(list.toString());
    System.out.println(list.isEmpty());
    System.out.println(list.contains("Jozadaque"));
    System.out.println("Size: " + list.size());

    Iterator myIt = list.iterator();
    
    System.out.println();
    while(myIt.hasNext())
    {
    
      System.out.println( myIt.next() + " " );
    
    }
    System.out.println();
    
    list.removeAll(otherList);
    
    System.out.println(list);
    
    System.out.println(list.hashCode());
    
    list.clear();
    
    System.out.println(list);
    
  }

}