import java.util.*;
import java.io.*;
class Helper{
    public int reverse_num(int n){
        int temp,rev=0;
        while(n!=0){
                temp=n%10;
                rev=rev*10+temp;
                n=n/10;
            
        }
        return rev;
    }
    public boolean palindrome_check(int n){
        int rev=reverse_num(n);
        if(n==rev)
            return true;
        else    
            return false;    
    }
}
class LabPgm8{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to be reversed");
        int n=s.nextInt();
        Helper h=new Helper();
        int rev=h.reverse_num(n);
        System.out.println("The reverse is "+ rev);
        boolean status=h.palindrome_check(n);
        System.out.println("Status : "+ status);
    }
}