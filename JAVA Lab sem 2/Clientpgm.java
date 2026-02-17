import java.net.*;
import java.io.*;
class Clientpgm{
    public static void main(String[] args){
        try{
            Socket cs= new Socket("localhost",1234);
            DataInputStream in = new DataInputStream(cs.getInputStream());
            String str= in.readUTF();
            System.out.println(str);

        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
        
    }
}