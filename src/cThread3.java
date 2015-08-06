import java.lang.Thread;
import java.util.*;

class Tuna implements Runnable
{

  String name;
  int time;
  Random r = new Random();

  public Tuna(String name)
  {
  
    this.name = name;
    this.time = r.nextInt(999);
  
  }
  
  public void run()
  {
  
    try
    {
    
      System.out.printf("%s us sleeping for %d\n", name, time);
      Thread.sleep(time);
      System.out.printf("%s is done\n", name);
    
    }
    catch(Exception e){}
  
  }
  
}

public class cThread3
{

  public static void main(String[] args)
  {
  
    Thread t1 = new Thread(new Tuna("one"));
    Thread t2 = new Thread(new Tuna("two"));
    Thread t3 = new Thread(new Tuna("three"));
    Thread t4 = new Thread(new Tuna("four"));
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    
  }

}