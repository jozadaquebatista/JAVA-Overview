import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class withoutGenerics
{

  public static void main(String[] args)
  {
  
    /*
    *
    * This probably will give us some warning, but no care about that.
    * The program will work normally, compile and execute it.
    * 
     */
    
    // Notice this Collection declared here, it's without a generic type
    // The only one thing is we'll have to make some casting, and this is boring.
    
    List myList = new ArrayList(10);
    
    myList.add(5);
    myList.add(8);
    myList.add(1);
    myList.add(6);
    
    
    
    // Showing the second element of ArrayList
    System.out.println(myList.get(1));
    
    // Making a iterator
    Iterator<String> it = (String)myList.iterator();
    
    System.out.println();
    
    while(it.hasNext())
    {
    
      System.out.print("This is element " + it.next() + " in position " + myList.indexOf(it.next()));
    
    }
    
    System.out.println();
  
  }

}