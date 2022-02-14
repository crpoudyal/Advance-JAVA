package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSet {

    public static void displayResult(ResultSet rs) throws SQLException {
        System.out.println("id\tname\tage\tprogram\tsubject");
        while (rs.next()) {
            System.out.print(rs.getInt("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getInt("age") + "\t");
            System.out.print(rs.getString("program") + "\t");
            System.out.println(rs.getString("subject") + "\t");
        }

    }

    public static ResultSet runStatement(Statement st) throws SQLException {
        String sql = "SELECT * FROM students";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    public static void updateTable(ResultSet rs) throws SQLException {
        rs.absolute(2);
        rs.updateString("program", "newchanged");
        rs.updateRow();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ajpdb";
        String hostName = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, hostName, password);
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = runStatement(st);
        displayResult(rs);
        updateTable(rs);
        ResultSet newRs = runStatement(st);
        System.out.println("after");
        displayResult(newRs);
        st.close();
        con.close();
    }

}
