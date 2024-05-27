package Basics;

public class ArithmaticOperators {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 45;

        // Add
        int add = num1 + num2;
        System.out.println(add);
        
        // Substruct
        int sub = num1 - num2;
        System.out.println(sub);
        
        // Multiply
        int mul = num1 * num2;
        System.out.println(mul);
        
        // Divide
        int div = num1 / num2;
        System.out.println(div);
        
        // Modulo
        int mod = num1 % num2;
        System.out.println(mod);
        
        // Divide and value is stored in double
        double div2 = num1 / num2;
        System.out.println(div2);
        
        // Divide and type casted value is stored in double
        double div3 = (double) (num1 / num2);
        System.out.println(div3);

        // Divide a type casted operand by another operand and value is stored in double
        double div4 = (double) num1 / num2;
        System.out.println(div4);

        // Similar operations and shorthands
        System.out.println("num1 = " + num1);
        num1 = num1 + 5;
        System.out.println("num1 = num1 + 5; -> " + num1);
        num1 += 5;
        System.out.println("num1 += 5; -> " + num1);

        // Increment by 1 in different way
        System.out.println("Increment by 1 in different way");
        System.out.println("num1 = " + num1);
        num1 = num1 + 1;
        System.out.println("num1 = num1 + 1; -> " + num1);
        num1 += 1;
        System.out.println("num1 += 1; -> " + num1);
        num1++;
        System.out.println("num1++; -> " + num1);
        ++num1;
        System.out.println("++num1; -> " + num1);

        //Pre Increment
        System.out.println("Pre Incremnt");
        int a = 10;
        int b = a;
        System.out.println("Before Increment, a = " + a + " and b = " + b);
        System.out.println("b = ++a;");
        b = ++a;   // Increment value and then fetch
        System.out.println("After Increment, a = " + a + " and b = " + b);

        //Post Increment
        System.out.println("Post Incremnt");
        a = 10;
        b = a;
        System.out.println("Before Increment, a = " + a + " and b = " + b);
        System.out.println("b = a++;");
        b = a++;   // Fetch value and then increment
        System.out.println("After Increment, a = " + a + " and b = " + b);


        //Pre Decrement
        System.out.println("Pre Decremnt");
        a = 10;
        b = a;
        System.out.println("Before Decrement, a = " + a + " and b = " + b);
        System.out.println("b = --a;");
        b = --a;   // Decrement value and then fetch
        System.out.println("After Decrement, a = " + a + " and b = " + b);

        //Post Decrement
        System.out.println("Post Decremnt");
        a = 10;
        b = a;
        System.out.println("Before Decrement, a = " + a + " and b = " + b);
        System.out.println("b = a--;");
        b = a--;   // Fetch value and then decrement
        System.out.println("After Decrement, a = " + a + " and b = " + b);
    }
}
