package np.edu.scst.dbdemo;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/ajpdb");
        rs.setUsername("root");
        rs.setPassword("");

        rs.setCommand("SELECT * FROM students");
        rs.execute();

        while (rs.next()) {
            System.out.print(rs.getInt("id") + "\t");
            System.out.print(rs.getString("name") + "\t");
            System.out.print(rs.getInt("age") + "\t");
            System.out.print(rs.getString("program") + "\t");
            System.out.println(rs.getString("subject") + "\t");

        }
        rs.close();
    }
}
