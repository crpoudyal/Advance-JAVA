package socket.programming;

import java.net.*;
import java.util.*;
import java.io.*;

public class TimeServer {

    public final static int PORT = 1370;

    public static void main(String[] args) {
        long differenceBetweenEphochs = 2208988800L;
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.1", 1370);
            socket.setSoTimeout(1500);

            InputStream raw = socket.getInputStream();
            long secSince1900 = 0;
            for (int i = 0; i < 4; i++) {
                secSince1900 = (secSince1900 << 8) | raw.read();
                long secSince1970 = secSince1900 - differenceBetweenEphochs;
                long msSince1970 = secSince1970 * 1000;
                Date time = new Date(msSince1970);
                System.out.println(time);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
