package networking.lab;

import java.net.*;

public class FindIpOfGivenHost {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress in = InetAddress.getByName("www.scst.edu.np");
        System.out.println("Ip address of www.scst.edu.np is " + in.getHostAddress() + "\n");

        InetAddress i = InetAddress.getByName("www.google.com");
        System.out.println("Ip address of www.google.com is " + i.getHostAddress() + "\n");

        InetAddress inet = InetAddress.getByName("www.facebook.com");
        System.out.println("Ip address of www.facebook.com is " + inet.getHostAddress() + "\n");

    }

}
