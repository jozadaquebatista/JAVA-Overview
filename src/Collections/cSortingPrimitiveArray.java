import java.util.Arrays;

public class cSortingPrimitiveArray
{

  public static void main(String[] args)
  {
  
    String[] names = { "joao", "lucas", "ana", "bruno" };
    
    int[] integers = {5,9,2,3,8,1};
    
    for(String name : names)
    {
    
      System.out.println(name);
    
    }
    
    for(int number : integers)
    {
    
      System.out.println(number);
    
    }
    
    Arrays.sort(names);
    Arrays.sort(integers);
  
    System.out.println("\nAFTER SORTING: \n");
    
    for(String name : names)
    {
    
      System.out.println(name);
    
    }
    
    for(int number : integers)
    {
    
      System.out.println(number);
    
    }
    
  
  }

}