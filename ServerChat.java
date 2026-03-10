import java.util.*;
import java.net.*;
import java.io.*;

class ServerChat {
    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is waiting...");

            Socket as = ss.accept();
            System.out.println("Client connected!");

            DataInputStream sin = new DataInputStream(as.getInputStream());
            DataOutputStream sout = new DataOutputStream(as.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";

            while (true) {

                str = sin.readUTF();
                System.out.println("Client says: " + str);

                if (str.equals("quit"))
                    break;

                System.out.print("Enter message (quit to exit): ");
                str = br.readLine();

                sout.writeUTF(str);

                if (str.equals("quit"))
                    break;
            }

            as.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
