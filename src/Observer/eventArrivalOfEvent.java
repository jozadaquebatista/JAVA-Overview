package Observer.observer;

import java.util.Date;

public class eventArrivalOfEvent
{

  private final Date arrivalTime;
  
  public eventArrivalOfEvent(Date arrivalTime)
  {
      super();
      this.arrivalTime = arrivalTime;
  }
  
  public Date getArrivalTime()
  {
    return arrivalTime;
  }

}