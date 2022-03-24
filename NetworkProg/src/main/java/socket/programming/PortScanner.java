package socket.programming;

import java.io.IOException;
import java.net.ServerSocket;

public class PortScanner {

    public static void main(String[] args) {
        for (int port = 1; port <= 5000; port++) {
            try {
                ServerSocket s = new ServerSocket(port);
            } catch (IOException ex) {
                System.out.println("There is a server on port " + port);
            }
        }
    }

}
