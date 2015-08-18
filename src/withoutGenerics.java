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
    
    myList.add("Marcos");
    myList.add("Weslley");
    myList.add("Bruno");
    myList.add("Joao");
    
    
    
    // Showing the second element of ArrayList
    System.out.println(myList.get(1));
    
    // Making a iterator
    Iterator it = myList.iterator();
    
    System.out.println();
    
    while(it.hasNext())
    {
    
      // As you can see casting objects is boring, awfull and tedious x_X
      // This is why we use Generics( Yeeaaaahhh! B) )
    
      String tmp = (String)it.next();
      
      System.out.println("This is element " + tmp + " in position " + myList.indexOf(tmp));
    
    }
    
    System.out.println();
  
    String nameOfSomeOne = (String)myList.get(2);

    System.out.println("nameOfSomeOne = " + nameOfSomeOne + ";" + "\n");
  
  }

}