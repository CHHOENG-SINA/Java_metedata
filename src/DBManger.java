
import java.sql.*;
import javax.swing.JOptionPane;
public class DBManger {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con != null) {
                return con;
            }
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/staffdb", "root", "");
            System.out.printf("Connected \n");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
}
