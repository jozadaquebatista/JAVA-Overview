import java.util.Scanner;

public class ScannerInput
{

  public static void main(String[] args)
  {
  
    Scanner input = new Scanner(System.in);
    int[] myArray = new int[9];
    
    for(int i=0; i < myArray.length; i++)
    {
    
      System.out.print("Insert the " + (i+1) + " value of " + i + " position of the Array.");
      myArray[i] = input.nextInt();
    
    }
    
    for(int i=0; i < myArray.length; i++)
    {
    
      System.out.println("myArray[" + i + "] = " + myArray[i] + ".");
    
    }
  
  }

}