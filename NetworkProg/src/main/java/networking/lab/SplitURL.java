package networking.lab;

import java.net.*;

public class SplitURL {

    public static void main(String[] args) {
        try {
            URL aURL = new URL(("ftp://mp3:mp3@138.247.121.61:21000/c%3a/"));

            System.out.println("protocol = " + aURL.getProtocol());
            System.out.println("authority = " + aURL.getAuthority());
            System.out.println("host = " + aURL.getHost());
            System.out.println("port = " + aURL.getPort());
            System.out.println("path = " + aURL.getPath());
            System.out.println("query = " + aURL.getQuery());
            System.out.println("filename = " + aURL.getFile());
            System.out.println("ref = " + aURL.getRef());
        } catch (MalformedURLException ex) {
            System.out.println("MalformedURLException occur");
        }

    }

}
