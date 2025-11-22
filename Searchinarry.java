import java.util.*;
class Searchinarry{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter an element to search in an array:");
        int ele=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                System.out.println(ele +" found at location "+i);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("element not found");
        }
    }
}