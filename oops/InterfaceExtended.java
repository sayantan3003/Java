package oops;

/**
 * Remember:
 * class - class --> extends
 * class - interface --> extends
 * interface - interface --> extends
 */

interface W   {
    int age = 25;
    double weight = 82.50;
    void run();
}

interface X   {
    int age = 20;
    void walk();
}


// Interface can extends multiple interfaces where class can not
interface Y extends W, X   {
    void eat();
}

interface Z   {
    void talk();
}

// class can implements multiple interfaces
class InterfaceClass implements Y, Z   {

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
    
}

public class InterfaceExtended {
    public static void main(String[] args) {
        Z ic = new InterfaceClass();
        
        ic.talk();
        // We can use talk() but can not use eat() because reference variable is of type <Z>and Z did not declare eat()
        // ic.eat();

        Y ic1 = new InterfaceClass();
        ic1.eat();
        ic1.run();
        // We can not use eat() because reference variable is of type <Y> and Y did not declare talk()
        // ic1.talk();

        System.out.println(Y.weight);
        // Here it shows "The field Y.age is ambiguous" because age comes from two different interfaces
        // System.out.println(Y.age);
    }
}
