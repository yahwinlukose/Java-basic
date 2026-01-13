import java.util.*;
class Mthread extends Thread{
    int n;
    public Mthread(int a){
        n=a;
    }
    public void run(){
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }
    public void runr(){
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}

class Thread1{
    public static void main(String[] args){
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n=s.nextInt();
        Mthread m=new Mthread(n);
        m.start();
    }
}