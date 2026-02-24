import java.io.*;
class SerializeDemo{
    public static void main(String[] args) throws Exception{
        try{
             Student s1=new Student(22,101,"Yahwin",95.5);
             FileOutputStream fout=new FileOutputStream("student.txt");
             ObjectOutputStream oos=new ObjectOutputStream(fout);
             oos.writeObject(s1);
             System.out.println("Object Serialized successfully");
             oos.close();
             fout.close();
            }catch(Exception e){
                System.out.println("Error :"+e.getMessage());
            }
   }
}