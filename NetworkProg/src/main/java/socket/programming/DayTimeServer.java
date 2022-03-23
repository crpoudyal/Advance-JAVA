package socket.programming;

import java.io.*;
import java.net.*;
import java.util.*;

public class DayTimeServer {

    public final static int PORT = 1100;

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(PORT);

        while (true) {
            Socket conn = server.accept();
            Writer out = new OutputStreamWriter(conn.getOutputStream());
            Date now = new Date();
            out.write(now.toString() + "\n\r");
            out.flush();
            conn.close();

        }
    }
}
