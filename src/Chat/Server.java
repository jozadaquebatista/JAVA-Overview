import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.io.IOException;
import java.lang.StringBuffer;
import java.lang.Thread;

public class Server
{
  
  Scanner reader;

  public Server()
  {

    try {
    
      ServerSocket server = new ServerSocket(5500);
      
      while(true)
      {

        
        Socket socket = server.accept();
        ListenClient task = new ListenClient(socket);
        //new Thread(new ListenClient(socket)).start();
        //scanner = new Scanner(socket.getInputStream());
        //System.out.println(scanner.nextLine());
          
      }
          
    } catch(IOException e){}
    
  }

  private class ListenClient implements Runnable
  {
  
    public void ListenClient(Socket sckt)
    {
    
      try {
      
        reader = new Scanner(sckt.getInputStream());        
      
      } catch(Exception e){}
      
    }
  
    public void run()
    {
    
      try {
      
        String text;
        while((text = reader.nextLine()) != null)
        {
        
          System.out.println("Msg: " + text);
        
        }
      
      } catch(Exception x){}
    
    }
  
  }

  public static void main(String[] args)
  {
  
    new Server();
  
  }

}