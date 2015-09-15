import java.util.Scanner;

public class charInput
{

    static public void main(String args[])
    {
    
        char choice;
        boolean flag = true;
        Scanner scan = new Scanner(System.in); // After look Console class too
        
        do {
        
            System.out.println("Choose a letter between a,b,c,d:");
            choice = scan.next().charAt(0);
            
            switch(choice)
            {
            
                case 'a':
                    System.out.println("You chosen letter 'a'.");
                    flag = false;
                    break;
                case 'b':
                    System.out.println("You chosen letter 'b'.");
                    flag = false;
                    break;
                case 'c':
                    System.out.println("You chosen letter 'c'.");
                    flag = false;
                    break;
                case 'd':
                    System.out.println("You chosen letter 'd'.");
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect choice.");
            
            }
            
        } while(flag);
    }

}
