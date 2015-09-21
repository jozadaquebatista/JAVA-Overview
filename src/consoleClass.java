

public class consoleClass
{

    public static void main(String[] args)
    {   
        String username = System.console().readLine("User Name? ");
        
        System.out.println("Your entry = " + username + ".");
        
        String password = System.console().readLine("Password? ");
        
        System.out.println("Your entry = " + password + ".");
        
        System.exit(0);
        
    }

}
