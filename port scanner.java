import java.net.*;
public class PortScanner {
    public static void main(String args[])
    {
        int start = 0;
        int stop = 65365;
        for (int i = start; i <= stop; i++)
        {
            try
            {
                Socket serverSok = new Socket("127.0.0.1", i);
                System.out.println("Port in use: " + i);
                serverSok.close();
            } catch (Exception e) 
            {
                System.out.println("Port not in use: " + i);
            }
        }
    }
}
