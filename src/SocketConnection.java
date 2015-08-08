import java.net.UnknownHostException;
import java.net.ConnectException;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;

class ServerSocketConnection
{

  public ServerSocketConnection() throws UnknownHostException, ConnectException, IOException
  {
  
    ServerSocket srv = new ServerSocket(5500);
  
  }
  
}

public class SocketConnection
{

  public static void main(String[] args) throws UnknownHostException, 
  InterruptedException, ConnectException, IOException
  {
  
    /* PORTS 0 - 1023 reserved by the operating system. */
   
    try {

      Scanner scan = new Scanner(System.in); /* Read a keyboard buffer */
      Random num = new Random();/* Generates  a random number */
      ServerSocketConnection server_sock = new ServerSocketConnection(); /* opening a server connection */
      Socket client = new Socket("localhost", 5500); /* After starts Server, then we open a client connection */
      int randomNum = num.nextInt(100);

      System.out.println(randomNum);
      System.out.println("Conexao realizada sem erros.");
      
      Thread.sleep(3000);
      //for(long i=0; i < 1000000000; i++) for(long j=0; j < 4; j++); // VERY VERY CRAZY DELAY =D
    
    } catch(ConnectException e) {
      
      System.out.println("Houve uma falha na conexao.");
    
    }
    
  }

}