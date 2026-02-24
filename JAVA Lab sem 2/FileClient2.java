import java.net.*;
import java.io.*;
class FileClient2{
    public static void main(String args[]) throws Exception{
        Socket as= new Socket("localhost",1234);
        DataInputStream din=new DataInputStream(as.getInputStream());
        DataOutputStream dout=new DataOutputStream(as.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name to download :");
        String filename=br.readLine();
        dout.writeUTF(filename);
        String response=din.readUTF();
        if(response.equals("FOUND")){
            FileOutputStream fout=new FileOutputStream("Downloaded_"+filename);
            int ch;
            while((ch=din.read())!=-1){
                fout.write(ch);
            } 
            fout.close();  
            
        }else{
            System.out.println("FILE NOT FOUND");
        }
        as.close();
    }


}