package networking.lab;

import java.net.URL;

public class CheckHostName {

    public static void main(String[] args) {
        try {
            URL u1 = new URL("http://www.ibiblio.org");
            URL u2 = new URL("http://www.helios.ibiblio.org");
            if (u1.sameFile(u2)) {
                System.out.println("Both \t\n" + u1.getHost() + " and " + u2.getHost() + " hostname are same");
            } else {
                System.out.println(u1.getHost() + " and " + u2.getHost() + " hostname are different");
            }

        } catch (Exception ex) {
            System.out.println("Exception occur");
        }
    }

}
