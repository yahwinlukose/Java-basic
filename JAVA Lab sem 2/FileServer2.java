import java.io.*;
import java.net.*;
class FileServer2{
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(1234);
        System.out.println("Server is listening....");
        Socket as= ss.accept();
        System.out.println("Client Connected");
        DataInputStream din=new DataInputStream(as.getInputStream());
        DataOutputStream dout=new DataOutputStream(as.getOutputStream());
        String filename=din.readUTF();
        File file=new File(filename);
        if(file.exists()){
            dout.writeUTF("FOUND");
            FileInputStream fin=new FileInputStream(file);
            int ch;
            while((ch=fin.read())!=-1){
                dout.write(ch);
            }
            fin.close();
            System.out.println("File sent successfully");

        }else{
            dout.writeUTF("Not found");
        }
        as.close();
        ss.close();


    }
}