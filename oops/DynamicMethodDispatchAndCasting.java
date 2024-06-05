package oops;

class Animal   {
    public void makeSound()   {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal   {
    public void makeSound()   {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal   {
    public void makeSound()   {
        System.out.println("Dog barks");
    }
}

// Runtime polymorphism
public class DynamicMethodDispatchAndCasting {
    public static void main(String[] args) {
        // Reference of superclass, object of subclass
        Animal a1 = new Animal();
        a1.makeSound();

        a1 = new Cat();
        a1.makeSound();

        a1 = new Dog
        ();
        a1.makeSound();

        // UpCasting it works by default
        Animal a2 = (Animal) new Dog();
        a2.makeSound();

        // It is throwing exception but this is here for concept
        // DownCasting
        Cat c1 = (Cat) a2;
        c1.makeSound();
    }
}
