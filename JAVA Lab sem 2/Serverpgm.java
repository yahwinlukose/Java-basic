import java.net.*;
import java.io.*;
class Serverpgm{
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("Waiting for client to connect :");
            Socket cs= ss.accept();
            DataOutputStream out= new DataOutputStream(cs.getOutputStream());
            out.writeUTF(" Hello from server ");
            out.close();
            ss.close();
            cs.close();

        }catch(Exception e){
            System.out.println("Error :"+ e.getMessage());
        }
    }
}