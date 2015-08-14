
public class raceChallenge
{

  public static void main(String[] args)
  {
    
    String status;
    
    // When a Runner wins the race, stop the race.
    Runner one = new Runner(1,0);
    Runner two = new Runner(2,0);
    Runner three = new Runner(3,0);
    
    one.start();
    two.start();
    three.start();
    
    while(one.isAlive() || two.isAlive() || three.isAlive())
    {
    
      if((one.isAlive()) == false)
      {
        status = "\n# Runner one wins the BIG AMAZING RACE\n";
        two.interrupt();
        three.interrupt();
        System.out.println(status);
      }
      
      if((two.isAlive()) == false)
      {
        status = "\n# Runner two wins the BIG AMAZING RACE\n";
        one.interrupt();
        three.interrupt();
        System.out.println(status);
      }
      
      if((three.isAlive()) == false)
      {
        status = "\n# Runner three wins the BIG AMAZING RACE\n";
        one.interrupt();
        two.interrupt();
        System.out.println(status);
      }
      
      try
      {
        System.out.println("Amazing race ladies and gentlemen. .... . ... ..");
        Thread.sleep(700);
        
      } catch(InterruptedException e) {
      
        System.out.println("Something unespected occurs, and the race was finished without winners.");
        one.interrupt();
        two.interrupt();
        three.interrupt();
      
      }
      
    }
    
  }
  
}