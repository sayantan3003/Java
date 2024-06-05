package oops;

/**
 * 1. Every constructor of Java has a method <super()> which is there, if you don't mention
 * 2. Every class in Java which is not inheriting other class class explicitly, extends Object class even if you don't mention
 */

class First   // extends Object
{
    // Overriding default constructor
    First()   {
        // It's there by default
        // super();   -> Call the constructor of super class
        System.out.println("In First");
    }

    First(int a)   {
        // It's there by default
        // super();   -> Call the constructor of super class
        System.out.println("In First int");
    }
}

class Second extends First   {
    // Overriding default constructor
    Second()   {
        // It's there by default
        // super();   -> Call the constructor of super class
        System.out.println("In Second");
    }

    Second(int a)   {
        // It's there by default
        // super();   -> Call the constructor of super class
        // But now we are changing it to parameterized constructor
        super(a);   // -> Call the constructor of super class
        
        // Referring to the constructor of current object
        // We can't use this() in here because we are explicitly using super()
        // this();

        System.out.println("In Second int");
    }

    Second(String name)   {
        // Referring to the constructor of current class
        this(name.length());
        System.out.println("In Second String");
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args) {
        // It calls constructor of Sub Class and Super Class both
        Second obj = new Second("Hi man!");
    }
}
