package oops;

class FirstClass   {
    void show()   {
        System.out.println("In A show.");
    }

    void config()   {
        System.out.println("In A config.");
    }
}

class SecondClass extends FirstClass   {
    // Method Overriding
    // You can put @Override annotation for your convinience if you don't add it, it will be okay
    @Override
    void show()   {
        System.out.println("In B show.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.show();
        sc.config();
    }
}
