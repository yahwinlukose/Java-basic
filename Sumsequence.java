import java.util.*;
class Sumsequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        
        int sum=0;
        int triangular=0;
        for(int i=1;i<=n;i++){
            triangular+=i;
            sum+=triangular;
        }
        
        System.out.println("The sum of the sequence is" + sum);
    }
}