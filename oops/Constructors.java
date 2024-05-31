package oops;

/**
 * Constructor name should be class name
 * There will be no return type
 * Every time you create a new object, it will call the constructor
 * Constructor can be overloaded like method
 */
class Manus   {
    String name;
    int age;

    // This is the default constructor if you don't provide any constructor
    // Manus()   {}

    // This is a constructor
    // Here, no local variable named name or age present that's why, it will work but
    // Use of <this> keyword is preferrable
    Manus()   {
        name = "Sayantan";
        age = 25;
        System.out.println("Hi, I'm in a constructor.");
    }

    // This is a constructor with public access modifier
    // It is a parameterized constructor
    public Manus(int age)  {
        name ="Sayantan";
        this.age = age;
    }

    // This is a constructor with private access modifier
    protected Manus(String name, int age)   {
        this.name = name;
        this.age = age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Manus h1 = new Manus();
        System.out.println(h1.name + " : " + h1.age);

        // We can not do this because constructor with String is not defined in Manus class
        // Manus h2 = new Manus("Das");
        // System.out.println(h2.name + " : " + h2.age);
    }
}