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
            System.out.println("This is thread t");
            try { Thread.sleep(300);} catch(InterruptedException e) {
            
              e.printStackTrace();
              
            }
            } 
            
          }
          
    }; t.start();
    
  }

}