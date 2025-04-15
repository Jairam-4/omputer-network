import java.net.*;

public class Main 
{
    public static void main(String[] args) 
 {
        try
    {          
     InetAddress ip = InetAddress.getByName("yahoo.com");
     System.out.println("Host Name : " + ip.getHostName());
     System.out.println("IP Address: " + ip.getHostAddress());
      } 
catch (UnknownHostException e)
      {
            System.out.println("Unable to resolve the IP address.");
            e.printStackTrace();
        }
    }
}
