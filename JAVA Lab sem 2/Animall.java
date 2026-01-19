class Animal{
    public void sound(){
        System.out.println("makes sound");
    }
    
}
class Dog extends Animal{
    public void sound(){
        super.sound();
        System.out.println("dog barks");
    }
}
class Animall{
    public static void main(String args[]){
        Dog a=new Dog();
        a.sound();
    }
}