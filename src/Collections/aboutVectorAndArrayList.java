import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;

public class aboutVectorAndArrayList
{

  public static void main(String[] args)
  {
  
    /* Generics they are important, we want a Vector of String, we don't like casting!*/
    Vector<String> names = new Vector<String>(3); // This means that vector will be initializes with 3 positions
                                  // However the vector will expand always
                                  
    names.add("Estevão");
    names.add("Jozadaque");
    names.add("Marlom");
    names.add("Joaquim");
    names.add("Lucas");
    names.add("Roberta");
    names.add("Paula");
    
    
    // There is two ways of print all elements
    System.out.println(names);
    System.out.println(names.toString());
    
    // Here I created an ArrayList that will contain 10 positions initially
    ArrayList<String> other = new ArrayList<String>(10);
    
    other.add("Claudio");
    other.add("Sthefanny");
    other.add("Simao");
    other.add("Manoela");
    other.add("Victor");
    
    // There is two ways of print all elements
    System.out.println(other);
    System.out.println(other.toString());
  
    // So now let's play with some interator to show this elements
    
    Iterator<String> it = names.iterator();
    
    while(it.hasNext())
    {
      
      String tmp = new String(it.next());
    
      System.out.println("[" + names.indexOf(tmp) + "] name in array is: " + tmp);
    
    }
  
  }

}