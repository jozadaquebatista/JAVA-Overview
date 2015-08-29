import java.lang.Thread;
import java.lang.StringBuilder;

public class threadAndRunnable extends Thread implements Runnable
{

    private StringBuilder msg;

    public threadAndRunnable(StringBuilder msg){ this.msg = msg; }

    public void run()
    {

	for(int i=0; i < 10; i++)
        {
	    System.out.println("olá!");
	    try{Thread.sleep(200);}catch(InterruptedException e){}         
        }

    }

    public void run(StringBuilder msg)
    {

	for(int i=0; i < 10; i++)
        {
	    System.out.println(msg);
	    try{Thread.sleep(200);}catch(InterruptedException e){}         
        }

    }

    public static void main(String[] args)
    {


	// Notice: void run method are the same to both, but I overloaded it.

	Thread t = new Thread(new threadAndRunnable(new StringBuilder("Hahaha"))); // this calls void run method 
	t.start();                                      // by the Interface Runnable

	(new threadAndRunnable()).start(); // this calls a Thread by class Thread()

	for(int i=0; i < 10; i++) // And it, only repetely shows a message 
        {
	    System.out.println("tchau!");
	    try{Thread.sleep(90);}catch(InterruptedException e){} 
        }

    }

}