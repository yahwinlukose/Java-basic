import java.net.*;
import java.io.*;

class MultiClient {
    public static void main(String[] args) throws Exception {

        Socket cs = new Socket("localhost", 1234);

        DataInputStream din = new DataInputStream(cs.getInputStream());
        DataOutputStream dout = new DataOutputStream(cs.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while (true) {
            System.out.println("Enter message/quit:");
            str = br.readLine();

            dout.writeUTF(str);
            dout.flush();

            if (str.equals("quit"))
                break;

            str = din.readUTF();
            System.out.println(str);
        }

        cs.close();
    }
}