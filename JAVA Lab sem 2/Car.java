class Vehicle{
    public void displaytype(){
        System.out.println("I am a vehicle");
    }
}
class Engine{
    public void start(){
        System.out.println("Engine is starting");
    }
}
class Car extends Vehicle{
  
        Engine engine;
        Car(){
            engine=new Engine();
        }
        public void startCar(){
            engine.start();
            displaytype();
        }
    public static void main(String[] args){
        Car c=new Car();
        c.startCar();
    }
}