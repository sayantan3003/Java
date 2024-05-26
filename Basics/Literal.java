package Basics;

public class Literal {
    public static void main(String[] args) {
        // Integer Literal
        // Binary Number
        int binaryNo = 0b101;
        System.out.println(binaryNo);

        // Octal Number
        int octNo = 023;
        System.out.println(octNo);
        
        // Decimal Number
        int decimalNo = 38;
        System.out.println(decimalNo);
        
        // Hexadecimal Number
        int hexNo = 0x1A;
        System.out.println(hexNo);

        // '_' the number separator
        int num = 12_34_567;
        System.out.println(num);

        // Float Literal
        // Double
        double doub = 1234;
        System.out.println(doub);

        // Using e
        double useEinNo = 1234e23;
        System.out.println(useEinNo);

        // Boolean
        boolean yes = true;
        System.out.println(yes);
        
        boolean no = false;
        System.out.println(no);

        char alpha = 'a';

        System.out.println(alpha);
        System.out.println(++alpha);
    }
}
