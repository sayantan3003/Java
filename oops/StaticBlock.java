package oops;

class SmartPhone    {
    // Static variable it's part of class not object
    static String name = "SmartPhone";

    // When class loading happens, it run
    // Remember: class loading happens first
    // Static block
    static   {
        name = "PulmPhone";
        System.out.println("Inside static block");
    }

    // Instance variable
    String brand;
    int price;

    // Constructor
    public SmartPhone() {
        brand = "";
        price = 200;
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // How to load a class without creating an object or calling static variable / method
        Class.forName("oops.SmartPhone");

        // System.out.println(Mobile.name);
        // Mobile obj1 = new Mobile();
    }
}
