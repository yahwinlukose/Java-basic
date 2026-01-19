import java.util.*;
import java.io.*;
class Fast1{
    Scanner s=new Scanner(System.in);
    String name;
    int id;
    /*public Fast1(String name,int id){
        this.name=name;
        this.id=id;
    }*/
    public void read(){
        System.out.println("enter the name of the author:");
        String name=s.nextLine();
    }
   
}class B extends Fast1{
    Scanner s=new Scanner(System.in);
    int num;
   /*public B(String name,int id,int num){
        super(name,id);
        this.num=num;
    }*/
       public void runn(){
         System.out.println("name :"+name);
         System.out.println("id :"+id);
         System.out.println("num :"+num);
    }
    public void read(){
        System.out.println("Enter the name of the book :");
        String name=s.nextLine();
    }
}
class Fast{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        /*System.out.println("Enter the name and the id:");
        String name=s.nextLine();
        int id=s.nextInt();
        int num=s.nextInt();
        B b=new B(name,id,num);
        b.runn();*/
        Fast1 f=new Fast1();
        B b=new B();
        f.read();
        b.read();

    }
}