package Network.programming;

import java.net.URL;

public class URLParse {

    public static void main(String[] args) {
        try {
            URL ul = new URL("ftp://mp3:mp3@192.168.10.100:21000/c%3a/");
            System.out.println("Protocol    : " + ul.getProtocol());
            System.out.println("UserInfo    : " + ul.getUserInfo());
            System.out.println("Host        : " + ul.getHost());
            System.out.println("Port        : " + ul.getPort());
            System.out.println("Path        : " + ul.getPath());
            System.out.println("Query       : " + ul.getQuery());
            System.out.println("Fragment Id : " + ul.getRef());

        } catch (Exception ex) {
            System.out.println("Exceptions " + ex);
        }
    }

}
