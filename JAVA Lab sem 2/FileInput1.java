import java.util.*;
import java.io.*;
class FileInput1{
    public static void main(String[] args){
    try{
        Scanner s=new Scanner(System.in);
        FileInputStream fis;
        String fn;
        System.out.println("Enter the file name :");
        fn=s.nextLine();
        fis=new FileInputStream(fn);
        int size=fis.available();
        byte []b=new byte[size];
        fis.read(b);
        String content=new String(b);
        System.out.println(content);
        fis.close();
    }catch(Exception e){
        System.out.println("Error :"+e.getMessage());
        
    }
}
}