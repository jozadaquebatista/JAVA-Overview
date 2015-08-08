import java.util.Scanner;
import java.util.InputMismatchException;

public class trycatchFinally
{

  public static void main(String[] args)
  {
  
    Scanner scanner = new Scanner(System.in);
    
    float x, y;

    do{
    
      try {
      
        System.out.println("Digite o primeiro número dividendo: ");
        x = scanner.nextFloat();
        
        System.out.println("Digite o segundo número divisor: ");
        y = scanner.nextFloat();
        
        System.out.println("Resultado: " + (x/y));
        break;
            
      } catch(ArithmeticException | InputMismatchException err) {
        err.getMessage();
        System.err.println();
        err.printStackTrace();
        
        // This line below rule out the wrong entering, and catch a new input.
        scanner.nextLine();
        
      } finally {
      
        /* The FINALLY block executes whatever the result of TRY block. */
        x = 10;
        y = 10;
      
      }
    
    }while(true);
  
  }

}