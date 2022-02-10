package Network.programming;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;

public class URLConnectionDemo {

    public static void main(String[] args) {
        try {
            URL ul = new URL("http://www.scst.edu.np/academics/computer-application");
            URLConnection con = ul.openConnection();

            InputStream stream = con.getInputStream();
            InputStream buffer = new BufferedInputStream(stream);
            Reader reader = new InputStreamReader(buffer);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println("Protocol    : " + ul.getProtocol());
            System.out.println("File        : " + ul.getFile());
            System.out.println("Host        : " + ul.getHost());
            System.out.println("Port        : " + ul.getPort());
        } catch (MalformedURLException ex) {

            System.out.println("Exception" + ex);
        } catch (IOException ex) {
            System.out.println("Exception" + ex);
        }

    }
}
