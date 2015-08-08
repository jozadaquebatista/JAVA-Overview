
public class Throws
{

  static int[] arrayNull;

  public static void main(String[] args) throws NullPointerException
  {
  
    /*
    * Some common type of Exceptions:
    * 
    * 1 - ArithmeticException
    * 2 - Exception
    * 3 - InputMismatchException
    * 4 - ArrayIndexOutOfBoundsException
    *
     */
  
    System.out.println(arrayNull.length);
  
    // Animal bird = new Hen();
    // Animal bird = (Hen) bird;
    
    // (Wrong Way)
    // Animal bird = new Dog();
    // Animal bird = (Dog) bird;
    // That makes an Exception
  
  }

}