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
  
  static Scanner userinput = new Scanner(System.in);
  
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
    
    int modOfNumbers = 5 % 1;
    System.out.println("5 % 1 = " + modOfNumbers);
    
    System.out.print("Enter your name: \n");
    
    
    // hasNextInt, hasNextFloat, hasNextDouble, hasNextByte, hasNextBoolean
    // nextInt, nextFloat, nextDouble, nextByte
    if(userInput.hasNextLine())
    {
        
      this.setName(userInput.nextLine());
    
    }
    
    
    
    public String getName(){ return name; }
    public String setName(){ this.name = name; }
    
    public String getWeight(){ return weight; }
    public String setWeight(){ this.weight = weight; }
    
    public String getHeight(){ return height; }
    public String setHeight(){ this.height = height; }
    
  }
  
  public static void main(String[] args)
  {
  
    Animal animal = new Animal();

    System.out.println("LoL, this worked!");
  
  }
  
}