// Importing required packages for input-output and networking
import java.io.*;
import java.net.*;

// Class declaration
public class FileServer {

    // Main method - program execution starts here
    public static void main(String[] args) throws Exception {

        // Creating ServerSocket object on port number 1234
        // Server waits for client connection on this port
        ServerSocket ss = new ServerSocket(1234);

        // Message to show server is ready
        System.out.println("Server is listening....");

        // Accepting client connection (blocking call)
        // Program waits here until client connects
        Socket s = ss.accept();

        // Message after client connects
        System.out.println("Client connected");

        // Creating DataInputStream to receive data from client
        DataInputStream din = new DataInputStream(s.getInputStream());

        // Creating DataOutputStream to send data to client
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        // Reading file name sent by client
        String filename = din.readUTF();

        // Creating File object using received file name
        File file = new File(filename);

        // Checking whether file exists in server directory
        if (file.exists()) {

            // Creating FileInputStream to read file data
            FileInputStream fin = new FileInputStream(file);

            // Informing client that file is found
            dout.writeUTF("FOUND");

            // Variable to store each byte
            int ch;

            // Reading file byte by byte
            while ((ch = fin.read()) != -1) {

                // Sending each byte to client
                dout.write(ch);
            }

            // Closing file input stream
            fin.close();

            // Message showing file sent successfully
            System.out.println("File sent successfully");

        } else {

            // Informing client that file is not found
            dout.writeUTF("NOTFOUND");

            // Message on server side
            System.out.println("File Not found");
        }

        // Closing socket connection
        s.close();

        // Closing server socket
        ss.close();
    }
}