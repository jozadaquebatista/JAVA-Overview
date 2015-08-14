import java.lang.Thread;

/* javac cThread2
*   
*   I created 4 threads, however by default Java runs a 
*   program using one thread only.
*   
*   TO SEE HOW IT WORKS:
*   while true; do tput reset; java cThread; sleep 2; clear; done
 */

public class cThread2
{

  public static void main(String[] args)
  {
    
    Thread t1 = new Thread()
    {
    
      public void run()
      {
          
        for(int i = 0; i != 2; i++)
        {
          System.out.println("Hi, I'm thread 1 ");
          
        } 
        
      }
      
    };

    Thread t2 = new Thread()
    {
    
      public void run()
      {
          
        for(int i = 0; i != 2; i++)
        {
          System.out.println("Hi, I'm thread 2");
          
        } 
        
      }
      
    };

    Thread t3 = new Thread()
    {
    
      public void run()
      {
          
        for(int i = 0; i != 2; i++)
        {
          System.out.println("Hi, I'm thread 3");
          
        } 
        
      }
      
    };

    Thread t4 = new Thread()
    {
    
      public void run()
      {
          
        for(int i = 0; i != 2; i++)
        {
          System.out.println("Hi, I'm thread 4");
          
        } 
        
      }
      
    };

    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    
  }

}

/* Use of Sleep()
  try
  {
    Thread.sleep(100);
  }
  catch(InterruptedException e)
  {
    e.printStackTrace();
  }*/