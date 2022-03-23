package np.edu.scst.chatapp;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        String str = (String) in.readUTF();
        System.out.println(str);
        ss.close();

    }
}
