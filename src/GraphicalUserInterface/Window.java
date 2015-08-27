
/*
*
* Code that I used to test JDK installation in my new
* slackware 14.1 OS
*
 */
import java.lang.StringBuffer; // I was to use that class, but JFrame use String format
import javax.swing.JFrame;


public class Window extends JFrame
{

    public Window(String title)
    {

        setTitle(title);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }

    public static void main(String[] args)
    {

        new Window("My cute Window 1.0b");

    }

} 
