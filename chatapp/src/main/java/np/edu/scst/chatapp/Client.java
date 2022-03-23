package np.edu.scst.chatapp;

import java.io.*;
import java.util.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 6666);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String msg;
        while (true) {
            msg = sc.nextLine();
            out.writeUTF(msg);
            out.flush();
            out.close();
            s.close();

        }

    }
}
