package networking.lab;

import java.net.*;

public class NoGovCookies implements CookiePolicy {

    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        if (uri.getAuthority().toLowerCase().endsWith(".gov") || cookie.getDomain().toLowerCase().endsWith(".gov")) {
            return false;

        }
        return true;
    }

}
