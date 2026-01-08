/* Program to implement run-time polymorphism in Java(interface).
@Jubin Joy
Roll no: 35
Date: 10/12/2025
*/
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Program19 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound(); // Run-time polymorphism
        a = new Cat();
        a.sound(); // Run-time polymorphism
    }
}


