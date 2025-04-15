import java.net.InetAddress;
import java.net.UnknownHostException;
public class Main
{
    public static void main(String[] args)
  {
        try
     {
            InetAddress myIP = InetAddress.getLocalHost();
            System.out.println("Host Name: " + myIP.getHostName());
            System.out.println("IP Address: " + myIP.getHostAddress());
     }  
catch (UnknownHostException e) 
       {
            System.out.println("Unable to determine IP address.");
            e.printStackTrace();
        }
   }
}
