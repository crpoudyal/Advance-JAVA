package socket.programming;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortScanScanning {

    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        for (int i = 1; i < 1024; i++) {
            try {
                Socket soc = new Socket(host, i);
                System.out.println("There is a server on port" + i + "of " + host);
                soc.close();
            } catch (UnknownHostException ex) {
                System.out.println("exception " + ex);

            } catch (IOException ex) {
                System.out.println("Exception " + ex);
            }
        }
    }
}
