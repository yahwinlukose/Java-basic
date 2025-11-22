import java.util.*;
class InterchangingFirst{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int first=sc.nextInt();
        System.out.println("Enter second number:");
        int second=sc.nextInt();
        System.out.println("Before interchanging: first number = "+first+", second number = "+second);
        // Interchanging values
        int temp=first;
        first=second;
        second=temp;
        System.out.println("After interchanging: first number = "+first+", second number = "+second);
    }
}