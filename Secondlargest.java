import java.util.Scanner;
class Secondlargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest=0,secondlargest=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    largest=arr[j];
                    secondlargest=arr[i];
                }
            }
        }
      System.out.println("The second largest element is: " + secondlargest);

    }
}