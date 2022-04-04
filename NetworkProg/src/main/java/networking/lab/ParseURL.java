package networking.lab;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

    public static void main(String[] args) throws MalformedURLException {
        URL ud = new URL("http://wwww.example.com:80/index.html");
        System.out.println("protocol: " + ud.getProtocol());
        System.out.println("host: " + ud.getHost());
        System.out.println("file: " + ud.getFile());
        System.out.println("path: " + ud.getPath());
        System.out.println("port: " + ud.getPort());

    }

}
