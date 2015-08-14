import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class Collections
{

  public static void print(String s)
  {
    System.out.print(s);
  }
  
  public static void print(Collection s)
  {
    System.out.println(s);
  }
  
  public static void print(Boolean s)
  {
    System.out.println(s);
  }

  public static void main(String[] args)
  {
    Collection<String> c = new ArrayList<>();
    
    c.add("A");
    c.add("B");
    c.add("C");
    c.add("D");
    c.add("E");
    
    /* Most Basic methods of Collection*/
    print(c.toString() + "\n");
    print(c.isEmpty());
    print(c.contains("A"));
    print(c.remove("C"));
    print(c.toString());
    
    /* Now adding other elements from other Collection */
    Collection<String> c2 = Arrays.asList("O", "U");
    c.addAll(c2);
    
    print("\n" + c.toString() + "\n");
    print(c.containsAll(c2)); // That verify if collection 2 is in the first collection
    
    c.removeAll(c2); // That will remove all of collection 2 elements from collection 1
    
    print(c.toString() + "\n"); // Looking in elements of collection 1
    
    /*  */
    print("Elementos do collection (1): [");
    for(String string : c)
    {
      print(string + "-");
    }
    print("]\n");
    
    String[] s = c.toArray(new String[c.size()]);
    
    print(Arrays.toString(s) + "\n");
    
    /* Then this is all we can do with  SET, LIST AND QUEUE */
  }

}