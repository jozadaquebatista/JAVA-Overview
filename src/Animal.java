// Coments here

/*
*
* and something here ...
*
 */
 
 
/* You can import classes of two different ways */
import java.util.Scanner;
import java.util.*;

public class Animal
{

  /*
  * public - means that is avaible to anyone else, so anyone can acess
  *
  * static - means that will be shared in all Animal object created
  *
  * final - means that is a constant, and can't be changed
  *
  * double - primite type of data, with double float value
  *
  * private - means this do not can be acess from other classes
  *
  * protected - means that can only be acessed by child classes
  * 
   */
  
  private String name;
  private int weight;
  private boolean hasOwner = false;
  private byte age;
  private long uniqueID;
  private char favoriteChar;
  private double speed;
  private float height;
  
  protected static int numberOfAnimal = 0;
  
  static Scanner userInput = new Scanner(System.in);
  
  public Animal()
  {

    numberOfAnimal++;
    
    int sumOfNumbers = 5 + 1;
    System.out.println("5 + 1 = " + sumOfNumbers);
    
    int diffOfNumbers = 5 - 1;
    System.out.println("5 - 1 = " + diffOfNumbers);
    
    int multOfNumbers = 5 * 1;
    System.out.println("5 * 1 = " + multOfNumbers);
    
    int divOfNumbers = 5 / 1;
    System.out.println("5 / 1 = " + divOfNumbers);
    
    int modOfNumbers = 5 % 3;
    System.out.println("5 % 1 = " + modOfNumbers);
    
    System.out.print("Enter your name: \n");
    
    
    // hasNextInt, hasNextFloat, hasNextDouble, hasNextByte, hasNextBoolean
    // nextInt, nextFloat, nextDouble, nextByte
    if(userInput.hasNextLine())
    {
        
      this.setName(userInput.nextLine());
    
    }
    
    this.setFavoriteChar();
    this.setUniqueID();
    
  }
  
  public String getName(){ return name; }
  public void setName(String name){ this.name = name; }
   
  public int getWeight(){ return weight; }
  public void setWeight(int weight){ this.weight = weight; }
   
  public double getSpeed(){ return speed; }
  public void setSpeed(double speed){ this.speed = speed; }
    
  public float getHeight(){ return height; }
  public void setHeight(float height){ this.height = height; }
    
  public char getFavoriteChar(){ return favoriteChar; }
  public void setFavoriteChar(char favoriteChar){ this.favoriteChar = favoriteChar; }
  public void setFavoriteChar()
  {
    
    int randomNumber = (int)(Math.random() * 126);
      
    this.favoriteChar = (char)randomNumber;
      
    /* Such as in c++, in JAVA you can make comparisons using if-else statement 
    *  !=, <=, >=, ==, ===, !==
    */
    if(randomNumber == 32)
    {
      
      System.out.println("Favorite character set to Space");
      
    } else if(randomNumber == 10) {
      
      System.out.println("Favorite character set to Space");
      
    } else {
      
      System.out.println("Favorite character set to " + this.favoriteChar);
      
    }
      
    // We've logical operator like !, &&, ||, ^
      
    if((randomNumber > 97) && (randomNumber < 122))
    {
     
      System.out.println("Favorite character is a lowercase.");
      
    }
      
    if((randomNumber > 97) && (randomNumber < 122) || (randomNumber > 64) && (randomNumber < 91))
    {
      
      System.out.println("Favorite character is a letter.");
      
    }
      
    if((randomNumber > 97) && (randomNumber < 122) || (randomNumber > 64) && (randomNumber < 91))
    {
      
      System.out.println("Favorite character is a letter.");
      
    }
      
    int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
      
    switch(randomNumber)
    {
      
      case 8:
        System.out.println("Favorite character set to backspace.");
        break;
      case 10:
          break;
      case 11:
          break;
      case 12:
        System.out.println("Favorite character set to something that I don't know.");
        break;
      default:
        System.out.println("Invalid number.");
        break;
      
    }
      
  }
    
  public byte getAge(){ return age; }
  public void setAge(byte age){ this.age = age; }
    
  public long getUniqueID(){ return uniqueID; }
  public void setUniqueID(long uniqueID)
  {
    
    this.uniqueID = uniqueID;
    System.out.println("Unique ID set to: " + this.uniqueID);
     
  }
    
  public void setUniqueID()
  {
    
    long minNumber = 1;
    long maxNumber = 1000000;
      
    this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));
    // To casting data type, just use (byte), (int), (double), (long), (char), son on...
    String stringNumber = Long.toString(maxNumber);
    // We can also convert a number to a string, Double, Int, so on, just passing 
    // dataType.toString(var_to_convert);
    int numberString = Integer.parseInt(stringNumber);
    // We can also convert a string to Int or Double, just passing
    // dataType.parseInt(var_to_convert);
      
  }
  
  protected static void countTo(int startingNumber)
  {
  
    for(int i = startingNumber; i <= 100; i++)
    {
    
      if(i == 90) continue;
      
      System.out.println(i);
    
    }
  
  }
  
  protected static String printNumbers(int maxNumbers)
  {
  
    int i = 1;
    
    while(i < (maxNumbers / 2))
    {
    
      System.out.println(i);
      i++;
      
      if(i == (maxNumbers / 2)) break;
    
    }
  
    Animal.countTo(maxNumbers / 2);
    
    return "End of printNumbers";
  
  }
  
  protected static void guessMyNumber()
  {
  
    int number;
    
    do {
    
      System.out.println("Guess Number up to 100");
    
      while(!userInput.hasNextInt())
      {
      
        String numberEntered = userInput.next();
        System.out.printf("%s is not a number\n", numberEntered);
      
      }
      
      number = userInput.nextInt();
      
    } while(number != 50);
  
  }
  
  public String makeSound()
  {
  
    return "Grrrr";
  
  }
  
  public static void speakAnimal(Animal randAnimal)
  {
  
    System.out.println("Animal says " + randAnimal.makeSound());
  
  }
  
  public static void main(String[] args)
  {
  
    Animal animal = new Animal();

    System.out.println("LoL, this worked!");
  
  }
  
  
  
}