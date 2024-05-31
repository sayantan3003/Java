package oops;

/**
 * For every primitive value, there is a class cassled --> Wrapper class
 */

public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 7;
        // Boxing
        // Integer num2 = new Integer(89);
        
        // Auto-Boxing --> Automatically converted that is why auto, otherwise only boxing
        Integer num2 = 89;   

        System.out.println(num1);
        System.out.println(num2);

        // Unboxing
        // num1 = num2.intValue(); 
        
        // Auto-Unboxing --> Automatically converted that is why auto, otherwise only unboxing
        num1 = num2;
        System.out.println(num1);

        System.out.println(Integer.parseInt("23"));
    }
}
 