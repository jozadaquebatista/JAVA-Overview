import java.util.Date;

public class eventArrivalOfPerson
{

  private final Date arrivalTime;
  
  public eventArrivalOfPerson(Date arrivalTime)
  {
      super();
      this.arrivalTime = arrivalTime;
  }
  
  public Date getArrivalTime()
  {
    return arrivalTime;
  }

}