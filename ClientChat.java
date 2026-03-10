import java.net.*;
import java.io.*;

class ClientChat {
    public static void main(String[] args) {
        try {

            // Create socket connection to server running on localhost at port 1234
            Socket socket = new Socket("localhost", 1234);

            // Create output stream to send data to server
            DataOutputStream sout = new DataOutputStream(socket.getOutputStream());

            // Create input stream to read data from keyboard
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter data (type 'quit' to exit):");

            String str = "";

            // Loop to continuously send messages
            while (true) {

                // Read user input
                str = br.readLine();

                // If user types quit, stop program
                if (str.equals("quit"))
                    break;

                // Send message to server
                sout.writeUTF(str);

                // Make sure data is sent immediately
                sout.flush();
            }

            // Close everything
            sout.close();
            br.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
