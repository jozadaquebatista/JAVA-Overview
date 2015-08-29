import java.lang.Thread;
import java.lang.StringBuilder;
import java.util.Random;

public class threadAndRunnable extends Thread implements Runnable
{

    private StringBuilder msg;

    public threadAndRunnable(){}
    public threadAndRunnable(StringBuilder msg){ this.msg = msg; }

    public void run()
    {
	// Generates a random number
	Random random_n = new Random();

	for(int i=0; i < 10; i++)
        {
	    System.out.println("olá!");
	    try{Thread.sleep(random_n.nextInt(200));}catch(InterruptedException e){}         
        }

    }

    public void run(StringBuilder msg)
    {
	// Generates a random number
	Random random_n = new Random();

	msg = this.msg;

	for(int i=0; i < 10; i++)
        {
	    System.out.println("Hahaha");
	    try{Thread.sleep(random_n.nextInt(200));}catch(InterruptedException e){}         
        }

    }

    public static void main(String[] args)
    {

	StringBuilder s = new StringBuilder("Hahaha");

	// Notice: void run method are the same to both, but I overloaded it.
	Thread t = new Thread(new threadAndRunnable(s)); // this calls void run method 
	t.start();                                       // by the Interface Runnable

	(new threadAndRunnable()).start(); // this calls a Thread by class Thread()

	for(int i=0; i < 10; i++) // And it, only repetely shows a message 
        {
	    System.out.println("tchau!");
	    try{Thread.sleep(90);}catch(InterruptedException e){} 
        }

    }

}