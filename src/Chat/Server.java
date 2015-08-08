import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.io.IOException;

public class Server
{

  public Server()
  {
  
    try {
    
      ServerSocket server = new ServerSocket(5500);
      Scanner scanner = null;
      
      while(scanner == null)
      {

        Socket socket = server.accept();
        scanner = new Scanner(socket.getInputStream());
        System.out.println(scanner.nextLine());
          
      }
          
    } catch(IOException e) { }
    
  }

  public static void main(String[] args)
  {
  
    new Server();
  
  }

}