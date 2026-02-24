import java.io.*;
class DeserializeDemo{
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            Student s2=(Student)ois.readObject();
            s2.display();
            fin.close();
            ois.close();
        }catch(Exception e){
            System.out.println("Error :"+e);
        }
    }
}