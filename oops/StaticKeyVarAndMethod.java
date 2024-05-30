package oops;

class Mobile    {
    // Instance variable
    String brand;
    int price;

    // Static variable it's part of class not object
    static String name = "SmartPhone";

    // Static block
    static   {
        name = "PulmPhone";
        System.out.println("Inside static block");
    }

    // Constructor
    public Mobile() {
        brand = "";
        price = 200;
        // We can initialize static variable inside a constructor no problem but not recommended see above
        // name = "Phone";
    }

    // Instance method
    // In non static method, you can use static variable
    void show() {
        // Local Variable
        int no = 3;
        System.out.println(brand + " : " + price + " : " + name);
    }
    
    // Static method
    // You can use static variable inside static method
    public static void showStatic() {
        System.out.println("Inside Static method " + name);

        // You can not use non static / instance variable inside static method
        // System.out.println(brand + " : " + price + " : " + name);
    }

    public static void showStatic2(Mobile obj) {
        System.out.println("Inside 2nd Static method ");

        // Now in this way you can use non static / instance variable inside static method
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticKeyVarAndMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // You can call it with object but it is not recommended see below
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1800;
        // You can call it with object but it is not recommended see below
        obj2.name = "SmartPhone";

        // Before change
        obj1.show();
        obj2.show();

        // You can call it with object but it is not recommended see below
        obj1.name = "Sayan";
        obj1.price = 2000;

        // After change
        obj1.show();
        obj2.show();

        // This is the correct way to change static variable
        Mobile.name = "MyPhone";

        // After change again
        obj1.show();
        obj2.show();

        // You can call it with object but it is not recommended see below
        obj1.showStatic();

        // You can call static method directly using class name
        Mobile.showStatic();

        // How to use non static / instance variable inside static method
        Mobile.showStatic2(obj1);

        // We can not do this, can not make static reference to non static variable / method
        // Mobile.brand;
        // Mobile.show();
    }
}
