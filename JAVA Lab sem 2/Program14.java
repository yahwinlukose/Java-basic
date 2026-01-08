/* Create a class for a student having (sno, sname, sprogram) [example sno 1,sname-sanjay,sprogram-MCA]. Provide functions for reading and displaying the same information. Also provide a function for comparing two student objects for equality.
@Jubin Joy
Roll no: 35
Date: 06-12-2025
*/
import java.util.*;

class Student 
{
    int sno;
    String sname;
    String sprogram;

    public void read() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student number:");
        sno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name:");
        sname = sc.nextLine();
        System.out.println("Enter student program:");
        sprogram = sc.nextLine();
    }

    public void display() 
    {
        System.out.println(sno);
        System.out.println(sname);
        System.out.println(sprogram);
    }

    public boolean compare(Student s) 
    {
        return sno == s.sno && sname.equals(s.sname) && sprogram.equals(s.sprogram);
    }
}

public class Program14 {
    public static void main(String args[]) {
        Student a = new Student();
        Student b = new Student();

        System.out.println("Enter student 1 details:");
        a.read();

        System.out.println("Enter student 2 details:");
        b.read();

        System.out.println("Student 1:");
        a.display();

        System.out.println("Student 2:");
        b.display();

        System.out.println("Both students equal: " + a.compare(b));
    }
}

