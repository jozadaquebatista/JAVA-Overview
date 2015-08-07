

public class StringMutavel
{

  public static void main(String[] args)
  {
  
    StringBuffer s0 = new StringBuffer();
    StringBuilder s1 = new StringBuilder("ES AVAJ");
    
    s1.toString();
    s1.length();
    s1.capacity();
    
    System.out.println("Size of String 1: " + s1.length());
    System.out.println(s1.capacity());
    System.out.println(s1);
    s1.reverse();
    s1.append(" 8 ");
    char[] c = {'c','o','m'};
    s1.append(c).append(" café."); 
    System.out.println(s1);
    
  }

}