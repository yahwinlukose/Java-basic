import java.util.*;
import java.io.*;
class SearchSort{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            System.out.println("enter element "+ i +":");
            a[i]=s.nextInt();
        }
        System.out.println("the elements of the array is:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter an element to search:");
        int search=s.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]==search){
                System.out.println("element found at position "+ i);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Element not found\n");
        }
        System.out.println("Do you wanna sort??(Y/N)");
        String ch=s.next();
        if(ch.equals("Y") || ch.equals("y")){
                for(int i=0;i<n-1;i++){
                    for(int j=0;j<n-i-1;j++){
                        if(a[j]>a[j+1]){
                            int temp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                        }
                    }
                }
        }else{
            System.out.println("Thank you");
        }
        System.out.println("array after sorting\n");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
}