import java.util.*;
class InterchangingThird{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int first=sc.nextInt();
        System.out.println("Enter second number:");
        int second=sc.nextInt();
        System.out.println("Before interchanging: first number = "+first+", second number = "+second);
        // Interchanging values using multiplication and division
        first = first * second;
        second = first / second;
        first = first / second;
        System.out.println("After interchanging: first number = "+first+", second number = "+second);
    }
}