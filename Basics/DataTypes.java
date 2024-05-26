package Basics;

/**
 * We can divide Data Types into two categories,
 * 1. Primitive Data Type
 * 2. Non-Primitive Data Type
 * 
 * Primitive Data Types are mainly divided into 4 categories,
 * a) Integer,
 * b) Floating,
 * c) Character,
 * d) Boolean
 */
public class DataTypes {
    public static void main(String[] args) {
        // Integer
        byte b = 1;   // Store 1 byte = 8 bit,   Range from -2^7 to 2^(7)-1 or -128 to 127
        short s = 2;   // Store 2 byte = 16 bit
        int i = 4;   // Store 4 byte = 32 bit
        long l = 8;   // Store 8 byte = 64 bit

        System.out.println( "Byte: " + b );
        System.out.println( "Short: " + s );
        System.out.println( "Int: " + i );
        System.out.println( "Long: " + l );

        // Floating
        float f = 10.23f;   // 4 Bytes
        double d = 5.6;   // Default, 8 Bytes
        
        System.out.println( "Float: " + f );
        System.out.println( "Double: " + d );

        // Caracter - 2 bytes follow UNICODE, not ASCII
        char c = 'k';

        System.out.println( "Char: " + c );

        // Boolean
        boolean bo = true; // 1 byte

        System.out.println(bo);
    }
}

