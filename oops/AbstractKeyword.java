package oops;

/**
 * Abstract class can only have
 * 1. Abstract method
 * 2. Normal method
 * 3. Both Abstract and Normal Method
 */

 // Abstract class
abstract class Box   {
    // Declare abstract method: drive()
    public abstract void drive();
}

// Abstract methods only belongs to an abstract class
abstract class Car   {
    // I am giving an abstract idea on how to drive a car
    public abstract void drive();

    // Define playMusic() method
    public void playMusic()   {
        System.out.println("Playing Music!");
    }
}

// Concrete class
class WagonR extends Car   {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // We can not make an object of an abstract class
        // Car c1 = new Car();

        Car c1 = new WagonR();
        WagonR w1 = new WagonR();
    }
}
