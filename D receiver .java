import java.net.*;
public class DReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        System.out.println("Waiting to receive packet...");
        ds.receive(dp);  // Wait for packet
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("Received message: " + msg);
        ds.close();
    }
}
