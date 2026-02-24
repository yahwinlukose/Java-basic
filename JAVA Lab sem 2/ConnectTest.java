import java.sql.*;
import java.util.Properties;

public class ConnectTest {
    public static void main(String[] args) {
        String[] urls = {
            "jdbc:oracle:thin:@//localhost:1521/freepdb1",
            "jdbc:oracle:thin:@127.0.0.1:1521/freepdb1",
            "jdbc:oracle:thin:@//localhost:1521:freepdb1",
            "jdbc:oracle:thin:@localhost:1521:freepdb1"
        };
        
        String user = "yahwin";
        String pass = "yahwin123";
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver: " + e.getMessage());
            return;
        }
        
        for (String url : urls) {
            System.out.println("\n=== Testing: " + url + " ===");
            try {
                Properties props = new Properties();
                props.setProperty("user", user);
                props.setProperty("password", pass);
                
                Connection conn = DriverManager.getConnection(url, props);
                System.out.println("SUCCESS! Connected: " + conn);
                conn.close();
                break;
            } catch (Exception e) {
                System.out.println("FAILED: " + e.getMessage());
            }
        }
    }
}
