import java.util.*;
class BitwiseOperators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int notNum1 = ~num1;
        int notNum2 = ~num2;
        int leftShiftNum1 = num1 << 2;
        int rightShiftNum1 = num1 >> 2;
        int leftShiftNum2 = num2 << 2;
        int rightShiftNum2 = num2 >> 2;
        int unsignedRightShiftNum1 = num1 >>> 2;
        int unsignedRightShiftNum2 = num2 >>> 2;
        
        System.out.println("Bitwise AND of "+num1+" and "+num2+" is: "+andResult);
        System.out.println("Bitwise OR of "+num1+" and "+num2+" is: "+orResult);
        System.out.println("Bitwise XOR of "+num1+" and "+num2+" is: "+xorResult);
        System.out.println("Bitwise NOT of "+num1+" is: "+notNum1);
        System.out.println("Bitwise NOT of "+num2+" is: "+notNum2);
        System.out.println(num1+" left shifted by 2 is: "+leftShiftNum1);
        System.out.println(num1+" right shifted by 2 is: "+rightShiftNum1);
        System.out.println(num2+" left shifted by 2 is: "+leftShiftNum2 );
        System.out.println(num2+" right shifted by 2 is: "+rightShiftNum2);
        System.out.println(num1+" unsigned right shifted by 2 is: "+unsignedRightShiftNum1);
        System.out.println(num2+" unsigned right shifted by 2 is: "+unsignedRightShiftNum2);
        
    }
}