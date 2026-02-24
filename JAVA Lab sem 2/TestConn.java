import java.sql.*;
import java.io.*;
import java.nio.charset.*;

public class TestConn {
    public static void main(String[] args) throws Exception {
        Writer out = new OutputStreamWriter(new FileOutputStream("result.log"), StandardCharsets.UTF_8);
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            out.write("Java: " + System.getProperty("java.version") + "\n");
            
            String url = "jdbc:oracle:thin:@//LAPTOP-RTFQUSDR:1521/freepdb1";
            out.write("URL: " + url + "\n");
            out.write("User: yahwin\n");
            
            Connection con = DriverManager.getConnection(url, "yahwin", "yahwin123");
            out.write("RESULT: SUCCESS\n");
            out.write("Connection: " + con + "\n");
            con.close();
        } catch (Exception e) {
            out.write("RESULT: FAILED\n");
            out.write("Error: " + e.getClass().getName() + "\n");
            String msg = e.getMessage();
            if (msg != null) {
                for (String line : msg.split("\n")) {
                    out.write("MSG: " + line.trim() + "\n");
                }
            }
        }
        out.flush();
        out.close();
    }
}
