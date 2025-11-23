import java.util.*;
class Sequence1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the sequence:");
        int n=sc.nextInt();
        int sum=0;
        
        System.out.println("The first " + n + " terms of the sequence are:");
        int i=1;
        while(i<=n){
            sum+=i; 
            i=i+2;
        }
        System.out.println("Sum of the first " + n + " terms is: " + sum);
    }
}