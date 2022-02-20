package Network.programming;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AllHeader {

    public static void main(String[] args) throws MalformedURLException, IOException {

        URL u = new URL("http://scst.edu.np/uploads/content_image/BCA_Course_Structure.png");
        URLConnection uc = u.openConnection();
        for (int j = 1;; j++) {

            String header = uc.getHeaderField(j);
            if (header == null) {
                break;
            }
            System.out.println(uc.getHeaderField(j) + ":" + header);
        }

    }

}
