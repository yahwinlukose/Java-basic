import java.util.*;
class Displaymton{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        
        System.out.println("The numbers from " + m + " to " + n + " are:");
        while(m<=n){
            System.out.print(m + " ");
            m++;
        }
    }
}