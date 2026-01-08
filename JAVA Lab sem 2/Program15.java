/* Program to implement the ISA and HASA relationship.
@Jubin Joy
Roll no: 35
Date: 08/12/2025
*/
class Vehicle {
    void displayType() {
        System.out.println("I am a Vehicle");
    }
}
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle { // ISA: Car is a Vehicle
    Engine engine; // HASA: Car has an Engine

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car is ready to go!");
    }
}

public class Program15 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayType(); // ISA
        myCar.startCar();    // HASA
    }
}


