import java.util.*;
class Recur{
    public void printAscending(int n){
        if(n==0)
            return;
        if(n>0){
            printAscending(n-1);
            System.out.println(n);
        }
    }
    public void printDescending(int n){
        if(n==1){
            return;
        }
        System.out.println(n);
        printDescending(n-1);
    }
}
class RecurE{
    public static void main(String args[]){
        Recur r=new Recur();
        r.printAscending(9);
        r.printDescending(9);
    }
}