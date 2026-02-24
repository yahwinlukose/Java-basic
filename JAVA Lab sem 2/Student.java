import java.io.*;
class Student extends Person1{
    int rollNo;
    String name;
    double marks;
    Student(int age,int r,String name,double m){
        super(age);
        rollNo=r;
        this.name=name;
        marks=m;
    }
    void display(){
        System.out.println("age :"+age);
        System.out.println("Roll No :"+rollNo);
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }
}