package basics;

// To compile+run this command, use java TypeConversionAndCasting.java
public class TypeConversionAndCasting {
    public static void main(String[] args) {
        // Type Conversion or Implicit Type Conversion
        // Byte
        byte b1 = 12;
        System.out.println("byte: " + b1);

        // To short conversion
        short s1 = b1;
        System.out.println("byte -> short: " + s1);

        // To int conversion
        int i1 = b1;
        int i2 = s1;
        System.out.println("byte -> int: " + i1);
        System.out.println("short -> int: " + i2);

        // To long conversion
        long l1 = b1;
        long l2 = s1;
        long l3 = i1;
        System.out.println("byte -> long: " + l1);
        System.out.println("short -> long: " + l2);
        System.out.println("int -> long: " + l3);

        // To float conversion
        float f1 = b1;
        float f2 = s1;
        float f3 = i1;
        float f4 = l1;
        System.out.println("byte -> float: " + f1);
        System.out.println("short -> float: " + f2);
        System.out.println("int -> float: " + f3);
        System.out.println("long -> float: " + f4);

        // To double conversion
        double d1 = b1;
        double d2 = s1;
        double d3 = i1;
        double d4 = l1;
        double d5 = f1;
        System.out.println("byte -> double: " + d1);
        System.out.println("short -> double: " + d2);
        System.out.println("int -> double: " + d3);
        System.out.println("long -> double: " + d4);
        System.out.println("float -> double: " + d5);


        // Type Casting or Explicit Type Conversion
        // Double
        double d6 = 123_456.789_123_456;
        System.out.println("double: ");

        // To float conversion
        float f5 = (float)d6;
        System.out.println("double -> float: " + f5);

        // To long conversion
        long l4 = (long)d6;
        long l5 = (long) f5;
        System.out.println("double -> long: " + l4);
        System.out.println("float -> long: " + l5);

        // To int conversion
        int i3 = (int) d6;
        int i4 = (int) f5;
        int i5 = (int) l4;
        System.out.println("double -> int: " + i3);
        System.out.println("float -> int: " + i4);
        System.out.println("long -> int: " + i5);

        // To short conversion
        short s2 = (short) d6;
        short s3 = (short) f5;
        short s4 = (short) l4;
        short s5 = (short) i3;
        System.out.println("double -> short: " + s2);
        System.out.println("float -> short: " + s3);
        System.out.println("long -> short: " + s4);
        System.out.println("int -> short: " + s5);

        // To byte conversion
        byte b2 = (byte) d6;
        byte b3 = (byte) f5;
        byte b4 = (byte) l4;
        byte b5 = (byte) i3;
        byte b6 = (byte) s2;
        System.out.println("double -> byte: " + b2);
        System.out.println("float -> byte: " + b3);
        System.out.println("long -> byte: " + b4);
        System.out.println("int -> byte: " + b5);
        System.out.println("short -> byte: " + b6);

        byte b7 = 10;
        byte b8 = 30;

        // Type promotion
        int i6 = b7 * b8;
        System.out.println(i6);
    }
}
