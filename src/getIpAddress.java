import java.net.InetAddress;
import java.net.UnknownHostException;

class getIpAddress
{
   public static void main(String args[]) throws UnknownHostException
   {
      System.out.println("Your local hostname and ip is: " + InetAddress.getLocalHost());
   }
}
