package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ajpdb";
        String hostName = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, hostName, password);
        Statement st = con.createStatement();
        String sql = "UPDATE students SET program='bca' WHERE id =2";
        System.out.println("Query " + sql);
        st.execute(sql);
        System.out.println("Update successfully");
        st.close();
        con.close();

    }

}
