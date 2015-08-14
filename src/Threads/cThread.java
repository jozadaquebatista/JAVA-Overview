import java.lang.Thread;


public class cThread extends Thread
{

  public static void main(String[] args)
  {
    
    Thread t = new Thread()
    {
    
      public void run()
      {
      
        for(int i = 0; i < 10; i++){
              
          try
          {
            System.out.println("This is thread t");
            Thread.sleep(300);
          }
          catch(InterruptedException e)
          {
            e.printStackTrace();
          }
          
          if(i == 3)
            break;
          
        } 
            
      }
    
    };
    t.start();
    for(int i = 0; i < 2; i++)
    {
    
      
    
    }
    
  }

}