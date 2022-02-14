package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ajpdb";
        String hostName = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, hostName, password);
        Statement st = con.createStatement();
        String sql = "SELECT * FROM students";
        System.out.println("Query " + sql);
        ResultSet rs = st.executeQuery(sql);
        System.out.println("id\tname\tage\tprogram\tsubject");

        while (rs.next()) {
            System.out.print(rs.getInt("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getInt("age") + "\t");
            System.out.print(rs.getString("program") + "\t");
            System.out.println(rs.getString("subject") + "\t");

        }

        st.execute(sql);
        st.close();
        con.close();
    }

}
