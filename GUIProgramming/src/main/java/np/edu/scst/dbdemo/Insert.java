package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ajpdb";
        String hostName = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, hostName, password);
    }
}
