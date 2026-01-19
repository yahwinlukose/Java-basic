import java.util.*;
import java.io.*;
class FileM{
    public void FileReaderExample(String fn){
        try{
             FileReader reader=new FileReader(fn);
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
            reader.close();
            }
            catch(Exception e){
                System.out.println("error"+e.getMessage());
            }
       
    }
}
class FileC{
    public static void main(String[] args){
        try{
             Scanner s=new Scanner(System.in);
            System.out.println("Enter the name of a file to create it:");
            String fn=s.nextLine();
            File file=new File(fn);
            if(file.createNewFile()){
                 System.out.println("file created");
                 BufferedWriter writer=new BufferedWriter(new FileWriter(   fn));
                 writer.write("hello");
                 writer.close();
            }
                   
            else
                System.out.println("File Already exists");  
         
            System.out.println("Do you wanna display the characters (yes/No):");
            String choice=s.nextLine();
            if(choice.equalsIgnoreCase("yes")){
                FileM m=new FileM();
                m.FileReaderExample(fn);

            }
            System.out.println("Wanna see Buffered Reader:?");
                String choice2=s.nextLine();
            if(choice2.equalsIgnoreCase("yes")){
                FileReader f=new FileReader(fn);
                BufferedReader br=new BufferedReader(f);
                String line;
                while((line=br.readLine())!=null){
                    System.out.println(line);
                }
                br.close();
            }
            System.out.println("");
          
        }catch(Exception e){
            System.out.println("error"+e.getMessage());
        }    
        
    }
}