import java.net.*;
import java.io.*;
class ClientC{
    public static void main(String[] args) throws Exception{
        Socket cs=new Socket("localhost",1234);
        DataInputStream din=new DataInputStream(cs.getInputStream());
        DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while(true){
            System.out.println("Enter data/quit :");
            str=br.readLine();
            dout.writeUTF(str);
            if(str.equals("quit"))
                break;
            try{
                str=din.readUTF();
                if(str.equals("quit"))
                break;
                System.out.println("Server says :"+str);  

            }catch(Exception e){
                System.out.println("error :"+e.getMessage());
                break;
            }
             
        }
        cs.close();
    }
}