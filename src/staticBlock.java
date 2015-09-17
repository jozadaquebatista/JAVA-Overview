

public class staticBlock
{

    public static void main(String[] args)
    {
    
        for(int i = 0; i < 10; i++)
        {
            System.out.println("counting ... " + i);
        }
        
        System.out.println("Counting has been finished.");
    
    }
    
    static
    {
    
        System.out.println("This block will be executed before the main class." + "\nStarting to count ...");
    
    }

}
