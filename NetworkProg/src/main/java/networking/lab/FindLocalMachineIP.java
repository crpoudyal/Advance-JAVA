package networking.lab;

import java.net.*;

public class FindLocalMachineIP {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            String hostName = address.getHostName();
            String hostAddress = address.getHostAddress();
            System.out.println("Your Machine Name is : " + hostName + "\n\t");
            System.out.println("Your Machine Ip Address is : " + hostAddress + "\n\t");

        } catch (UnknownHostException e) {
            System.out.println("Couldn't find IP");
        }
    }

}
