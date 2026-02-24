import java.io.*;
import java.net.*;
class MultiServer{
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(1234);
        System.out.println("Socket is listening...");
        while(true){
            Socket cs=ss.accept();
            System.out.println("Client connected");
            ClientHandler ch=new ClientHandler(cs);
            ch.start();
        }
    }
    
}
class ClientHandler extends Thread{
    Socket cs;
    DataInputStream din;
    DataOutputStream dos;
    BufferedReader br;
    ClientHandler(Socket socket) throws Exception{
        cs=socket;
        din=new DataInputStream(cs.getInputStream());
        dos=new DataOutputStream(cs.getOutputStream());
        


    }
    public void run(){
        try{
            String str;
            while(true){
                str=din.readUTF();
                System.out.println("Client says :"+str);
                if(str.equals("quit")){
                    break;
                }
            
                dos.writeUTF("Server Recieved :");
                dos.flush();

            }
            cs.close();
        }catch(Exception e){
            System.out.println("error :"+e.getMessage());
        }
    }
}