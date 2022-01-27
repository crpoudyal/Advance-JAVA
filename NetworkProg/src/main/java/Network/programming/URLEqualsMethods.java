package Network.programming;

import java.net.URL;

public class URLEqualsMethods {

    public static void main(String[] args) {
        try {
            URL u1 = new URL("http://www.example.com");
            URL u2 = new URL("http://example.com");

            if (u1.equals(u2)) {
                System.out.println(u1 + " Equals to " + u2);
            } else {
                System.out.println(u1 + " NotEquals to " + u2);
            }
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }

}
