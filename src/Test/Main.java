// Program that reads user line arguments and print it using a especific class

public class Main
{

    public static void main(String[] args)
    {

        StringBuffer msg_args = null;

        try
        {
            msg_args = new StringBuffer( args[0] );         
        }
        catch (Exception e)
        {
            System.err.println("Correct Use of Program: java main arg[0].");
        }
        finally 
        {
            if(msg_args != null)
            {
                Print msg = new Print( new StringBuffer(msg_args) );
            }
        } 
    
    }

}
