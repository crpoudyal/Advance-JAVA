package Network.programming;

import java.net.InetAddress;

public class Network {

    public static void main(String[] args) {
        String host = "www.scst.edu.np";
        try {
            InetAddress addr = new InetAddress.getByName(host);

            System.out.println("Host Address: " + addr.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
