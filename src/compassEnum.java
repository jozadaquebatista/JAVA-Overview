

enum Compass
{

    NORTH("Hotel"),
    SOUTH("Park"),
    EAST("Store"),
    WEST("Home");
    
    String place = null;

    Compass(String p)
    {
        place = p;
    }

}

public class compassEnum
{

    public static void main(String[] args)
    {
        Compass pointer = Compass.NORTH;
        Compass goingTo = Compass.SOUTH;        
        
        if(pointer.equals(Compass.NORTH))
        {
            System.out.println("pointer is pointing to the NORTH.");
        }
        else
        {
            System.out.println("pointer is pointing to another direction.");
        }
        
        System.out.println("I'm happy today and I'm going to the " + goingTo.place + "! =)");
        
    }

} 
