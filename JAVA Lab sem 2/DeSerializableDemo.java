import java.io.*;
class DeSerializableDemo{
    public static void main(String[] args){
        try{
            
            
            FileInputStream fos=new FileInputStream("new.dat");
            ObjectInputStream oos=new ObjectInputStream(fos);
            Student s2=(Student)oos.readObject();
            fos.close();
            oos.close();
            s2.display();

        }catch(Exception e){
            System.out.println("Error :"+e);
        }
    }
}