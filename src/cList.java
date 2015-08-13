import java.util.List;
import java.util.ArrayList;

public class cList
{

  public static void main(String[] args)
  {
  
    List<String> list = new ArrayList<>();
    
    list.add("Futebol");
    list.add("Tenis");
    list.add("Futebol");
    list.add("Basquete");
    list.add("Volei");
    list.add("Boxe");
    
    System.out.println(list.toString());
    
    for(int i=0; i < list.size(); i++)
    {
      String letra = list.get(i);
      list.set(i, letra);
    }
  
    System.out.println(list.get(3));
    System.out.println(list.set(3, "Natação".toUpperCase())); 
    System.out.println(list.toString()); 
  }
  

}