package socket.programming;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SocketInfo {

    public static void main(String[] args) throws IOException, UnknownHostException, SocketException {
        for (String host : args) {

            Socket theSocket = new Socket(host, 443); // http == 80 , https == 443
            System.out.println("connect to " + theSocket.getInetAddress() + " on port " + theSocket.getPort()
                    + " from port" + theSocket.getLocalAddress() + " on port " + theSocket.getLocalPort());

        }

    }
}
