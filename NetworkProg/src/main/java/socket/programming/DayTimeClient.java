package socket.programming;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DayTimeClient {

    public static void main(String[] args) throws IOException {
        var hostname = "in.pool.ntp.org";
        int port = 13;
        try ( var Socket = new Socket(hostname, port)) {
            try ( var reader = new InputStreamReader(Socket.getInputStream())) {
                int character;
                var output = new StringBuilder();
                while ((character = reader.read()) != -1) {
                    output.append((char) character);
                }
                System.out.println(output);

            }
        }
    }
}
