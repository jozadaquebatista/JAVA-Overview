import java.lang.StringBuilder;

public class Constructors
{

  int i;

  public Constructors(String name)
  {
    
    System.out.println(i); // By default java gives the value 0(zero) to variable
    System.out.println("Olá " + name + "!");
    
  }

  public static void main(String[] args)
  {
  
    Constructors c = new Constructors("Jozadaque");
  
    System.out.println(c.getClass());
  
  }

}