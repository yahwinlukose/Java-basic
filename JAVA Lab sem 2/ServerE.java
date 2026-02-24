import java.io.*;
import java.net.*;
class ServerE{
    public static void main(String[] args){
        ServerSocket ss;
        Socket cs;
        DataInputStream din;
        DataOutputStream dout;
        BufferedReader br;
        String str="welcome";
        try{
            ss= new ServerSocket(1234);
            System.out.println("Server is listening.....");
            cs=ss.accept();
            din=new DataInputStream(cs.getInputStream());
            dout=new DataOutputStream(cs.getOutputStream());
            br=new BufferedReader(new InputStreamReader(System.in));
            while(true){
                dout.writeUTF(str);
                if(str.equals("quit"))
                    break;
                str=din.readUTF();
                if(str.equals("quit"))
                    break;
                System.out.println("Message from the client :"+str);
                System.out.println("Enter data/quit to terminate :");
                str=br.readLine();    
                 

            }
            cs.close();
            ss.close();
        }catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}