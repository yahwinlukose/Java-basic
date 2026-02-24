import java.sql.*;

public class Connect {
    public static void main(String[] args) {

        try {
            // 1️⃣ Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2️⃣ Establish connection
           Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/FREE",
                "c##yahwin",
                "yahwin"
            );

            System.out.println("Connected Successfully: " + con);

            // 3️⃣ Create Statement object
            Statement st = con.createStatement();  // () was missing

            // 4️⃣ Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM TEST2");  
            // Make sure your table name is TEST2 (no space)

            // 5️⃣ Get metadata
            ResultSetMetaData rd = rs.getMetaData();

            int columnCount = rd.getColumnCount();  // Correct method name

            // 6️⃣ Print column names
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rd.getColumnName(i) + "\t");
            }

            System.out.println();

            // 7️⃣ Print table data
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

            // 8️⃣ Close resources
            rs.close();
            st.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error");
            e.printStackTrace();
        }
    }
}