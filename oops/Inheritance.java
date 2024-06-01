package oops;

// Parent class
// Super class
// Base class
// Upper class
class Calculator   {
    int add(int n1, int n2)   {
        return n1 + n2;
    }
    
    int sub(int n1, int n2)   {
        return n1 - n2;
    }
}

// Child class
// Sub class
// Derived class
// Lower class
class ScientificCalculator extends Calculator   {   // -> ScientificCalculator is Calculator
    int mul(int n1, int n2)   {
        return n1 * n2;
    }

    int div(int n1, int n2)   {
        return n1 / n2;
    }

    int mod(int n1, int n2)   {
        return n1 % n2;
    }
}


/**
 * If we do not have java file for Calculator and only have class file, then also we can inherite and use Calculator
 * This is an example of single level inheritance 
 */
public class Inheritance {
    public static void main(String[] args) {
        Calculator bc = new Calculator();

        ScientificCalculator sc = new ScientificCalculator();

        System.out.println(bc.add(12, 5) + " " + sc.mul(9, 6));
    }
}
