package oops;

class A   {
    A()   {
        System.out.println("Object is created");
    }

    void show() {
        System.out.println("Inside show method.");
    }
}

public class AnonymusObject {
    public static void main(String[] args) {
        // Declaring and Assigning value
        A ob = new A();

        // Declare the object or reference creation
        A obj; 

        // Object creation
        new A();    // Anonymous Object, we can't reuse them, we have no reference

        // Creating an object and assign the value to obj
        obj = new A();

        // Use of anonymous object
        new A().show();
    }
}
