package Network.programming;

import java.net.*;

public class VersionTest {

    public static int getVersion(InetAddress addr) {

        byte[] address = addr.getAddress();

        if (address.length == 4) {
            return 4;
        } else if (address.length == 16) {
            return 6;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) throws UnknownHostException {

        int res = getVersion(InetAddress.getByName("2400:1a00:b050:bd50:e5b2:5de:6d75:86cd"));
        System.out.println(res);
    }

}
