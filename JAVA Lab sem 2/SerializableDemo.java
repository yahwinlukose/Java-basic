import java.io.*;
class Address implements Serializable{
    String city;
    String street;
    Address(String city,String street){
        this.city=city;
        this.street=street;
    }

}
class Student implements Serializable{
    String name;
    int age;
    Address addr;//HAS-A
    Student(String name,int age,Address addr){
        this.name=name;
        this.age=age;
        this.addr=addr;
    }
    public void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("city :"+addr.city);
        System.out.println("street :"+addr.street);
    }
}
class SerializableDemo{
    public static void main(String[] args){
        try{
            Address a1=new Address("delhi","delhis");
            Student s1=new Student("yahwin",22,a1);
            
            FileOutputStream fos=new FileOutputStream("new.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s1); 
            fos.close();
            oos.close();

        }catch(Exception e){
            System.out.println("Error :"+e);
        }
    }
}