import java.util.*;
class SumFact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        double sum=0;
        double fact=1;
        
        for(int i=1;i<=num;i++){
            fact*=i;
            sum+=(double)i/fact;
           
        }
        
        System.out.println("The sum of is: " + sum);
    }
}