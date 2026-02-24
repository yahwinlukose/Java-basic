import java.net.*;
import java.io.*;
class ServerC{
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(1234);
        System.out.println("Server is listening");
        Socket cs=ss.accept();
        System.out.println("client connected");
        DataInputStream din=new DataInputStream(cs.getInputStream());
        DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while(true){
            str=din.readUTF();
            if(str.equals("quit"))
                break;
            System.out.println("Client says :"+str);     
            System.out.println("Enter data/quit :");    
            str=br.readLine();
            if(str.equals("quit"))
                break;
            dout.writeUTF(str);
              



        }
        
    }
}