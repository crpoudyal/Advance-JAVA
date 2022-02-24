package Network.programming;

import java.net.HttpURLConnection;
import java.net.URL;

public class EstConnection {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://scst.edu.np/");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        System.out.println("The connected URL " + http.getURL());
    }

}
