import java.net.*;
public class DSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome Jai";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        byte[] data = str.getBytes();
        DatagramPacket dp = new DatagramPacket(data, data.length, ip, 1234);
        ds.send(dp);
        System.out.println("Packet sent successfully!");
        ds.close();
    }
}
