package Observer.observer;

public class girlFriend implements eventArrivalOfObserver
{

  @override
  public void Arrival(eventArrivalOfEvent event)
  {
    System.out.println("Turn off the lights...");
    System.out.println("Be quiet...");
    System.out.println("Surprise!");
  }

}