import java.util.Scanner;

public class cAssertions
{

  public static void main(String[] args)
  {
    int num;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Type a number from 0 to 10: ");
    num = scanner.nextInt();
    
    assert(num >= 0 && num <= 10) : "Invalid number!";
    System.out.println("You entered: " + num);
    
    /*
    *  Assertions should be used to verify errors in programming time,
    *  and should be turned off after.
    *  To run this program and see assertions type in prompt line: java -ea cAssertions
    *  after compile.
     */
    
  }

}