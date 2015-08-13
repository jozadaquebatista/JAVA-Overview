

public class supriseBirthdayParty
{
  
  public static void main(String[] args)
  {
    girlFriend girlfriend = new girlFriend();
    doorMan doorman = new doorMan();
    
    doorman.addEventArrivalOfObserver(girlfriend);
    
    doorman.start();
  }
  
}