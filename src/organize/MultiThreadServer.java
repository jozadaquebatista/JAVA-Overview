
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultiThreadServer implements Runnable {
   Socket csocket;
   MultiThreadServer(Socket csocket) {
      this.csocket = csocket;
   }

   public static void main(String args[]) 
   throws Exception {
      ServerSocket ssock = new ServerSocket(1234);
      System.out.println("Listening");
      while (true) {
         Socket sock = ssock.accept();
         System.out.println("Connected");
         new Thread(new MultiThreadServer(sock)).start();
      }
   }
   public void run() {
      try {
         PrintStream pstream = new PrintStream (csocket.getOutputStream());
         pstream.println("Hello guest! =D");
         //pstream.close();
         //csocket.close();
         
         Scanner scan = new Scanner(System.in);
         char answer;
         
         while(true)
         {
                     
            System.out.println("[Server:]You'd like to send any msg?<S/n>");
            pstream.println( scan.nextLine() );
            /*answer = scan.next().charAt(1);
            
            if( answer == 'S' )
            {
                pstream.close();
                csocket.close();
            }
            else
            {
                pstream.close();
                csocket.close();
            }*/
            //System.out.println(answer.getClass());
         
         }
      }
      catch (IOException e) {
         System.out.println(e);
      }
   }
} 
