import java.util.Scanner;
import java.lang.Exception; /* Exceptions do not need import */

class Div
{

  StringBuilder msg;

  public Div(StringBuilder msg)
  {
    this.msg = new StringBuilder(msg);
  }
  
  public Div()
  {
    this.msg = new StringBuilder("RESULTADO: ");
  }
  
  public double FuncDiv(double x, double y)
  {
  
    if(x == 1)
    {
      System.out.print(msg);
      return y;
    }
    else if(y == 1)
    {
      System.out.print(msg);
      return x;
    }
    else
    {
      System.out.print(msg);
      return (x / y);
    }
    
  }

}

public class tryCatch
{

  public static void main(String[] args)
  {
  
    double x, y;
    Scanner scan = new Scanner(System.in);
    StringBuilder msg = new StringBuilder("Resultado da divisao: ");
    Div op = new Div(msg);
  
    try {
    
      System.out.print("Type first Integer: ");
      x = scan.nextDouble();
      
      System.out.print("Type second Integer: ");
      y = scan.nextDouble();
      
      System.out.println(op.FuncDiv(x,y));
      
    } catch(ArithmeticException err) { /* If ocurrs an Exception, such as a division by a letter
                                        *  the program break, and print a message. */
      System.out.println(err.getMessage());                                  
    
    }
  
  }

}