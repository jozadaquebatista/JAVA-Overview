import java.util.regex.Pattern;

public class Regex
{

  public static void main(String[] args)
  {
  
      String text = "I'm a computer programmer",
             pattern = ".*computer.*",
             name = "John";
             
      boolean matches = Pattern.matches(pattern, text);
      
      System.out.println("The pattern matches = " + matches);
      
      if(Pattern.matches("[Jj]ohn", name))
        System.out.println("Hello John! :D bool=" + (boolean)(Pattern.matches("[Jj]ohn", name)));
      else
        System.out.println("I don't know you");
      
  }

}