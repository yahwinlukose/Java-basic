import java.util.*;
class Differenceusingwhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();
        int difference=0;
        while(num1!=num2){
            if(num1>num2){
                num2++;
            }else{
                num2--;
            }
            difference++;
        }
        System.out.println("The difference is : " + difference);
    }
}