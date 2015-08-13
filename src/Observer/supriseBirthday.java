package Observer.observer;

public supriseBirthdayParty
{
  
  public static void main(String[] args)
  {
    girlFriend girlfriend = new girlFriend();
    doorMan doorman = new doorMan();
    
    doorman.addEventArrivalOfEvent(girlfriend);
    
    doorman.start();
  }
  
}