// Importing required packages for input-output and networking
import java.io.*;
import java.net.*;

// Class declaration
public class FileClient {

    // Main method - program execution starts here
    public static void main(String[] args) throws Exception {

        // Creating socket object
        // Connecting to server running on localhost at port 1234
        Socket s = new Socket("localhost", 1234);

        // Creating DataInputStream to receive data from server
        DataInputStream din = new DataInputStream(s.getInputStream());

        // Creating DataOutputStream to send data to server
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        // Creating BufferedReader to read file name from user (keyboard input)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Asking user to enter file name
        System.out.print("Enter file name to download: ");

        // Reading file name from keyboard
        String filename = br.readLine();

        // Sending file name to server
        dout.writeUTF(filename);

        // Receiving response from server (FOUND or NOTFOUND)
        String response = din.readUTF();

        // If server says file is found
        if (response.equals("FOUND")) {

            // Creating FileOutputStream to save downloaded file
            FileOutputStream fout = new FileOutputStream("Downloaded_" + filename);

            // Variable to store each byte
            int ch;

            // Reading data from server byte by byte
            while ((ch = din.read()) != -1) {

                // Writing received byte into new file
                fout.write(ch);
            }

            // Closing file output stream
            fout.close();

            // Success message
            System.out.println("File downloaded successfully!");

        } else {

            // If server says file not found
            System.out.println("File not found on server.");
        }

        // Closing socket connection
        s.close();
    }
}