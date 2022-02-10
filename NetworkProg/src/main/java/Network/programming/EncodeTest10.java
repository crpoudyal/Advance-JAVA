package Network.programming;

import java.net.*;

public class EncodeTest10 {

    public static void main(String[] args) throws Exception {
        String url = URLEncoder.encode("http://www.google.com/search?", "UTF-8");
        url += URLEncoder.encode("hl", "UTF-8");
        url += "=";
        url += URLEncoder.encode("en", "UTF-8");
        url += "&";
        url += URLEncoder.encode("as_q", "UTF-8");
        url += "=";
        url += URLEncoder.encode("Java", "UTF-8");
        url += "&";
        url += URLEncoder.encode("as_epq", "UTF-8");
        url += "=";
        url += URLEncoder.encode("I/O", "UTF-8");
        System.out.println(url);
    }

}
