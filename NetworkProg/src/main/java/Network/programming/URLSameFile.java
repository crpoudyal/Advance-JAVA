package Network.programming;

import java.net.URL;

public class URLSameFile {

    public static void main(String[] args) {

        try {
            URL u1 = new URL("http://ncsa.uiuc.edu/htmlform.html");
            URL u2 = new URL("http://ncsa.uiuc.edu/htmlform.html#g3");

            if (u1.sameFile(u2)) {
                System.out.println(u1 + " have same resource as " + u2);
            } else {
                System.out.println("U1 doesn't have same resource as U2");
            }
        } catch (Exception exp) {
            System.out.println(exp);
        }
    }
}
