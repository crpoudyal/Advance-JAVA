package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ajpdb";
        String hostName = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, hostName, password);
        Statement st = con.createStatement();
        String sql = "DELETE FROM students WHERE id=2";
        System.out.println("Query " + sql);
        st.executeUpdate(sql);
        System.out.println("Delete successfully");
        st.close();
        con.close();
    }

}
