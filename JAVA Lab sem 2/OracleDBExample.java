import java.sql.*;

public class OracleDBExample 
{
    public static void main(String[] args) {
        try {

            // Load Oracle Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Print which driver is loaded
            System.out.println("Driver location: " +
                oracle.jdbc.OracleDriver.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation());

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/freepdb1",
                "yahwin",
                "yahwin123"
            );

            System.out.println("Connected.. " + con);

            // Create statement
            Statement st = con.createStatement();

            // INSERT query
            String query = "INSERT INTO Test2 VALUES (201, 'Vava', 22)";

            // Execute update (used for INSERT)
            int rows = st.executeUpdate(query);

            if(rows > 0) {
                System.out.println("Record Inserted Successfully!");
            } else {
                System.out.println("Insert Failed!");
            }

            // Close connection
            con.close();

        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}