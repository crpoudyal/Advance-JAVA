package Network.programming;

import java.net.URL;

public class URLDemo {

    public static void main(String[] args) {
        try {
            URL ul = new URL("http://www.example.com:80/index.html");
            System.out.println("Protocol    : " + ul.getProtocol());
            System.out.println("File        : " + ul.getFile());
            System.out.println("Host        : " + ul.getHost());
            System.out.println("Port        : " + ul.getPort());
            System.out.println("Path        : " + ul.getPath());
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        }

    }

}
