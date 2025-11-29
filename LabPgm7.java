import java.util.*;
import java.io.*;
class Largest{
     public int Compare(int a,int b){
            return a>b ? a:b;
        }
}
class LabPgm7{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Largest l=new Largest();
        System.out.println("Enter three numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max=l.Compare(a,b);
        int greatest=l.Compare(max,c);
        System.out.println("greatest number is " +greatest);
       
    }
}