class LabPgm1 extends Thread{
    public void run(){
         System.out.println("Thread is running");
    }
    public static void main(String args[]){
       
        LabPgm1 t1=new LabPgm1();
        LabPgm1 t2=new LabPgm1();
        t1.start();
        t2.start();
        
    }
}