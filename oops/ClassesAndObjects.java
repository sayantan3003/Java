package oops;

// Template class defination
class Template  {
    // Properties
    String property1 = "1st property";
    int property2 = 2;

    // Methods
    // Take Nothing Return Nothing.
    void method1()   {
        System.out.println("1. Take Nothing Return Nothing.");
    }

    // Take Something Return Nothing.
    void method2( String name )   {
        System.out.println("2. Take Something Return Nothing.");
    }

    // Take Nothing Return Something.
    String method3()   {
        String message = "3. Take Nothing Return Something.";
        System.out.println(message);
        return message;
    }

    // Take Something Return Something.
    String method4(String name)   {
        String message = "4. Take Something Return Something.\nYour name is " + name;
        System.out.println(message);
        return message;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Template obj1 = new Template();
        System.out.println(obj1.property1);
        System.out.println(obj1.property2);
        obj1.method1();
        obj1.method2("Sayan");
        System.out.println(obj1.method3());
        System.out.println(obj1.method4("Sayantan"));
    }
}
