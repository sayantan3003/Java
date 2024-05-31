package oops;

// final - variable, method, class
// To make constant, we use final
/**
 * final-
 *      variable - constant
 *      method - to stop method overriding
 *      class - to stop inheritance
 */
class GrandFather   {
    public final void land()   {
        System.out.println("In GrandFather land.");
    }
}

final class Father extends GrandFather   {
    // Can not override land because in GrandFather class, it is final
    // public void land()   { System.out.println("In Son Land"); }
}

// Can not override Father class because it is final
// class Son extends Father   {}

public class FinalKeyword {
    public static void main(String[] args) {
        // Making BRAND constant with keyword final
        final String BRAND = "Apple";

        // Can not change final variable
        // BRAND = "Samsung";

        System.out.println(BRAND);
    }
}
