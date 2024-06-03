package oops;

/**
 * static can be used only for the inner class
 */

class Outer   {
    public void show()   {
        System.out.println("In show method");
    }

    // Non static class
    class Inner1   {
        void config1()   {
            System.out.println("In inner1 -> config1");
        }
    }

    // static class
    static class Inner2   {
        void config2()   {
            System.out.println("In inner2 -> config2");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        // Normal inner class object
        Outer.Inner1 obj1 = obj.new Inner1();
        obj1.config1();

        // static inner class object
        Outer.Inner2 obj2 = new Outer.Inner2();
        obj2.config2();
    }
}
