import java.util.*;
interface ishape{
    public void draw();
    public void mov();
}
class Circle implements ishape{
    public void draw(){
        System.out.println("circle is drawing");
    }
    public void mov(){
        System.out.println("circle is moving");
    }
}
class Rectangle implements ishape{
    public void draw(){
        System.out.println("Rectangle is drawing");
    }
    public void mov(){
        System.out.println("Rectangle is moving");
    }
}
class InterfaceE{
    public static void main(String[] args){
        try{
            Scanner s=new Scanner(System.in);
            ishape obj;
            System.out.println("enter a choice 1.Rectangle 2.Circle");
            int ch=s.nextInt();
            if(ch==1){
                obj=new Rectangle();
            }else{
                obj=new Circle();
            }
            obj.draw();
            obj.mov();
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}