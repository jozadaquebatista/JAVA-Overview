package Observer.observer;

import java.util.Scanner;
import java.util.ArrayList;

public class doorMan extends Thread
{

  private List<eventArrivalOfEvent> observers = new ArrayList<eventArrivalOfEvent>();
  
  public void addEventArrivalOfEvent(eventArrivalOfEvent observer)
  {
    this.observers.add(observer);
  }

  @override
  public void run()
  {
    Scanner scanner = new Scanner(System.in);
    
    while(true)
    {
      int value = scanner.nextInt();
    
      if(value == 1)
      {
        eventArrivalOfEvent event = new eventArrivalOfEvent(new Date());
        
        // Notify observers
        for(eventArrivalOfEvent observer : this.observers)
        {
          observer.Arrival(event);
        }
      } else {
        
        System.out.println("False alarm!");
      }
    }
  }

}