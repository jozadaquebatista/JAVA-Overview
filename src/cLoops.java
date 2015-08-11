/*
*
* This file has errors, if fix them cut off this comment.
* UPDATE: Now Fixed
*
 */

class Recursive
{
  public Recursive(){}
  
  static int Looping(int i)
  {
    System.out.println("I'm the var ()'i') = " + i + ", and I'm inside the recursive function.");
    i++;
      
    if(i != 10)
      return Looping(i);
    else
      return 0;
  }
  
  public static void main(String[] args){}
}

public class cLoops
{

  public static void main(String[] args)
  {
    /* We have three type of standard loop statements = FOR, WHILE and DO-WHILE*/
    
    //example
    while(true)
    {
      for(int i=0; i<10; i++)
      {
        do {
          System.out.println("value of 'i' now is = " + i);
        } while(i == 10);
      }
      break; // When var i >= 10 break all statements.
    }
  /*
  *  Other way to get this same effect, is by using recursive functions
  *  However this way probably can give us a stack overflow.
   */

    // we'll use this variable soon.
    int varloop = 0;
    
    (new Recursive()).Looping(varloop); // executes a recursive function
  }
  
}