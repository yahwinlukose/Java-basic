import java.sql.*;

public class ConnectTest3 {
    public static void main(String[] args) {
        String[] urls = {
            "jdbc:oracle:thin:@//localhost:1521/freepdb1",
            "jdbc:oracle:thin:@//LAPTOP-RTFQUSDR:1521/freepdb1",
            "jdbc:oracle:thin:@//127.0.0.1:1521/freepdb1",
            "jdbc:oracle:thin:@LAPTOP-RTFQUSDR:1521/freepdb1"
        };
        
        String user = "yahwin";
        String pass = "yahwin123";
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle Driver loaded\n");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed: " + e);
            return;
        }
        
        for (String url : urls) {
            System.out.println("Testing: " + url);
            try {
                Connection conn = DriverManager.getConnection(url, user, pass);
                System.out.println("✓ SUCCESS!\n");
                conn.close();
                return;
            } catch (SQLException e) {
                System.out.println("✗ " + e.getMessage() + "\n");
            }
        }
    }
}
