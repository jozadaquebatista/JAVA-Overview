import java.util.Random;
import java.lang.Thread;
import java.io.*;

public class Runner extends Thread implements interfaceRunner
{

  private int runnerID;
  private float quilometers;
  
  public Runner(int runnerID, float quilometers)
  {
    this.runnerID = runnerID;
    this.quilometers = quilometers;
  }
  
  public void Run()
  {
    System.out.println("Runner " + this.runnerID + " is running fast ...");
  }
  
  public void Break()
  {
    System.out.println("Runner 1 stops to rest");
  }
  
  public void run()
  {
    // Here I say what thread have to do ...
    // I've got to look for
    
    while(quilometers < 3)
    {
      int number;
      
      Random randNumber = new Random();
      while((number = randNumber.nextInt(1500)) < 950)
      {
        if(number < 1050)
          number += 300;
        else
          break;
      }
      
      try
      {
        this.Run();
        Thread.sleep(number);
        this.Break();
        this.quilometers += Math.random();
        System.out.println();
      }
      catch(InterruptedException e)
      {
      
        e.printStackTrace();
        
      }
    
    }
    
    System.out.println("******[ Runner " + runnerID + " ] = Finished the race.");

  }

}