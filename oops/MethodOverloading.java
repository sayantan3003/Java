package oops;

class B   {
    // Here add method is overloaded 
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    double add(double n1, int n2) {
        return n1 + n2;
    }

    double add(int n1, double n2) {
        return n1 + n2;
    }

    double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        B calc = new B();

        int num1 = calc.add(23, 12);
        double num2 = calc.add(23.152, 12);
        double num3 = calc.add(23, 12.384);
        double num4 = calc.add(13.678, 12.9731);
        int num5 = calc.add(23, 12, 15);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}
