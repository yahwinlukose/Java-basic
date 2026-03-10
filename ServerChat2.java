import java.util.*;
import java.io.*;
import java.net.*;
class ServerChat2{
    public static void main(String[] args){
        try{
             ServerSocket ss;
        Socket as;
        DataInputStream kin,sin;
        DataOutputStream sout;
        BufferedReader br= new BufferedReader(new InputStreamReader());
        String str ="";
        while(true){
            str= sin.readUTF();
            System.out.println("Client says :"+str);
            if(str.equals("quit"))
                break;
            System.out.println("Enter data/quit :");
            str = br.readLine();    
            sout.writeUTF(str);
            if(str.equals("quit"))
                break;
        }

        }catch(Exception e){
            System.out.println("Error :"+ e.getMessage());
        }
       
    
    }
}