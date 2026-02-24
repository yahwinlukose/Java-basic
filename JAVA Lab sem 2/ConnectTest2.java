import java.sql.*;

public class ConnectTest2 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        
        String[][] credentials = {
            {"yahwin", "yahwin123"},
            {"YAHWIN", "yahwin123"},
            {"yahwin", "YAHWIN123"},
            {"c##yahwin", "yahwin"},
            {"C##YAHWIN", "yahwin"}
        };
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Oracle Driver loaded\n");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver: " + e);
            return;
        }
        
        for (String[] cred : credentials) {
            System.out.println("Testing: user=" + cred[0] + ", pass=" + cred[1]);
            try {
                Connection conn = DriverManager.getConnection(url, cred[0], cred[1]);
                System.out.println("✓ SUCCESS! Connected: " + conn);
                conn.close();
                return;
            } catch (SQLException e) {
                System.out.println("✗ " + e.getMessage());
            }
        }
    }
}
