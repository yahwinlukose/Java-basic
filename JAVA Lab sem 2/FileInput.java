import java.io.*;
import java.util.*;
class FileInput{ 
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    try{
        FileInputStream fis;
        String fn;
        System.out.println("Enter the file nane :");
        fn=s.nextLine();
        fis=new FileInputStream(fn);
        int i;
        while((i=fis.read())!=-1){
            System.out.println((char)i);
        }
    fis.close();    
    }catch(Exception e){
        System.out.println("Error :"+e.getMessage());
    }
      
    }
}