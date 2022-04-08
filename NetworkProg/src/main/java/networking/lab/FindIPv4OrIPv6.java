package networking.lab;

import java.net.*;

public class FindIPv4OrIPv6 {

    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("FF00::");
            byte[] address = ia.getAddress();
            if (address.length == 4) {
                System.out.println("IPv4 Address");
            } else if (address.length == 16) {
                System.out.println("IPv6 Address");
            }
        } catch (UnknownHostException ex) {
            System.out.println("Unknown Host");
        }

    }
}
