import java.lang.Thread;
import java.util.Random;

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

// MAIN CLASS

public class cThread3
{

  public static void main(String[] args)
  {
  
    Thread t1 = new Thread(new Tuna("one"));
    Thread t2 = new Thread(new Tuna("two"));
    Thread t3 = new Thread(new Tuna("three"));
    Thread t4 = new Thread(new Tuna("four"));
    Thread t5 = new Thread(new Tuna("five"));
    Thread t6 = new Thread(new Tuna("six"));
    Thread t7 = new Thread(new Tuna("seven"));
    Thread t8 = new Thread(new Tuna("eight"));
    Thread t9 = new Thread(new Tuna("nine"));
    Thread t10 = new Thread(new Tuna("ten"));
    Thread t11 = new Thread(new Tuna("eleven"));
    Thread t12 = new Thread(new Tuna("twelve"));
    Thread t13 = new Thread(new Tuna("thirteen"));
    Thread t14 = new Thread(new Tuna("fourteen"));
    Thread t15 = new Thread(new Tuna("fifteen"));
    Thread t16 = new Thread(new Tuna("sixteen"));
    Thread t17 = new Thread(new Tuna("seventeen"));
    Thread t18 = new Thread(new Tuna("eighteen"));
    Thread t19 = new Thread(new Tuna("nineteen"));
    Thread t20 = new Thread(new Tuna("twenty"));

    /* This doesn't Works D=
    
    for(int i=1; i != 4; i++)
    {
    
      t(i).start();
    
    }*/
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    t9.start();
    t10.start();
    t11.start();
    t12.start();
    t13.start();
    t14.start();
    t15.start();
    t16.start();
    t17.start();
    t18.start();
    t19.start();
    t20.start();
    
  }

}