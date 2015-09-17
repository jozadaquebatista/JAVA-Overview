import java.net.Socket;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.io.IOException;

public class ClientSocket
{

    public static void main(String[] args) throws IOException
    {

        try 
        {
        
            // Simple server socket creation
            ServerSocket myserversocket = new ServerSocket(55789);
        
            // Simple client socket creation
            Socket myclientsocket = new Socket("127.0.0.1", 55788);
        }
        catch(UnknownHostException u)
        {
            System.out.println("Sorry, unable to create socket or conect to it.");
        }

    }

}
