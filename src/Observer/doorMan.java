import java.lang.Thread;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class doorMan extends Thread
{

  private List<eventArrivalOfObserver> observers = new ArrayList<>();
  
  public void addEventArrivalOfObserver(eventArrivalOfObserver observer)
  {
    this.observers.add(observer);
  }

  public void run()
  {
    Scanner scanner = new Scanner(System.in);
    
    while(true)
    {
      int value = scanner.nextInt();
    
      if(value == 1)
      {
        eventArrivalOfPerson event = new eventArrivalOfPerson(new Date());
        
        // Notify observers
        for(eventArrivalOfObserver observer : this.observers)
        {
          observer.arrival(event);
        }
        
      } else {
        
        System.out.println("False alarm!");
      }
    }
  }

}