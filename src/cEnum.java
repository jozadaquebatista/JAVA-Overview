public class cEnum
{

  private enum Color
  {
  
    RED,
    BLUE,
    YELLOW,
    PURPLE
  
  }

  public static void main(String[] args)
  {
  
  
    // But when I print it out on screen that gives me the value
    // equals to the name of enum, unlike c/c++, that return me a 
    // number value. It's a little bit confusing.
  
    System.out.println(Color.PURPLE);
  
  }

}