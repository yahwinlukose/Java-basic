public class LabPgm2 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        LabPgm2 r1=new LabPgm2();
        LabPgm2 r2=new LabPgm2();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}