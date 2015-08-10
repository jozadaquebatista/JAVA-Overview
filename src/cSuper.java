import java.util.Scanner;
import java.util.InputMismatchException;


class Person
{

  private String name;
  private int age;
  
  public Person(String name, int age)
  {
    this.name = name;
    this.age  = age;
  }

  public String getName()
  {
    return this.name;
  }
  
  public void message()
  {
    System.out.println("The World is cool! =D");  
  }
  
  public void message(String msg)
  {
    System.out.println(msg);
  }

}

class Msg
{

  StringBuilder msg = new StringBuilder("Hello Chef!");

  public Msg()
  {
    System.out.println("You're my master.");
  }

}

public class cSuper extends Msg
{

  String my_other_msg = new String(super.msg);

  public cSuper()
  {
    System.out.println(my_other_msg);
    System.out.println(msg);
  }
  
  public cSuper(String msg)
  {
    System.out.println(msg);
    System.out.println(msg);
  }

  public static String questionReview(int question)
  {
    String msg;
    
    switch(question)
    {
      case 0:
        return (new String("You chose 0"));
      case 1:
        return (new String("You chose 1"));
      case 2:
        return (new String("You chose 2"));
      case 3:
        return (new String("You chose 3"));
      case 4:
        return (new String("You chose 4"));
      case 5:
        return (new String("You chose 5"));
      case 6:
        return (new String("You chose 6"));
      case 7:
        return (new String("You chose 7"));
      case 8:
        return (new String("You chose 8"));
      case 9:
        return (new String("You chose 9"));
      case 10:
        return (new String("You chose 10"));
      default:
        return (new String("You do not chose any choice."));
    }
  }
  
  public static void main(String[] args)
  {
    new cSuper();
    Scanner question = new Scanner(System.in);
    
    {
      Person eu = new Person("Jozadaque", 21);
      
      System.out.println("My name is: msg = " + "[ msg = " + eu.getName() + " ]");      
    }
    
    /* Gives me an error, because the object eu was destroyed =D
    * eu.getMessage();
     */
    
    try {
    
      System.out.print("Choose a number between 0 - 10: ");
      System.out.println(questionReview(question.nextInt()));
    
    } catch(InputMismatchException e) {
    
      e.printStackTrace();
      System.err.println("\n*Motivo: Voce entrou com um valor não numérico!");
    
    }
  }

}