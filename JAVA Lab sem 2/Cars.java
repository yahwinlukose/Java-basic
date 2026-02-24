import java.io.*;
class Engines implements Serializable{
    int no;
    public Engines(int no){
        this.no=no;
    }
    public void show(){
        System.out.println("Engine is started");
    }

}

class Body implements Serializable{
    int bno;
    Engines e;
    public Body(int bno,Engines obj){
        this.bno=bno;
        e=obj;
    }
    public void disp(){
        e.show();
        System.out.println("Body is rolling");
    }

}

public class Cars{
    public static void main(String[] args){
        try{
        Engines obj = new Engines(123);
        Body b= new Body(456,obj);
        FileOutputStream fout = new FileOutputStream("n.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(b);
        }
        catch(Exception e){}
    }
}