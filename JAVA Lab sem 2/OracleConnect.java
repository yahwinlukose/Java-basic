// Import JDBC classes
import java.sql.*;

public class OracleConnect {

    public static void main(String[] args) {

        // 1. Connection details
        String url = "jdbc:oracle:thin:@localhost:1521/free"; 
        String user = "c##yahwin";        // or your own user
        String password = "yahwin";

        try {
            // 2. Load Oracle driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 3. Create connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle!");

            // 4. Create statement
            Statement stmt = con.createStatement();

            // 5. Execute query
            ResultSet rs = stmt.executeQuery(
                "SELECT instance_name FROM v$instance"
            );

            // 6. Read result
            while (rs.next()) {
                System.out.println("Instance: " + rs.getString(1));
            }

            // 7. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
