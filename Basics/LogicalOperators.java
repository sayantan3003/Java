package Basics;

/**
 * Logical Operator
 *  ||, &&, !
 *  || and && are also called short circuit
 */
public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println(2>4 && 9<12);
        System.out.println(22>4 && 9<2);
        System.out.println(12>7 && 9<12);

        System.out.println(2>4 || 9<12);
        System.out.println(22>4 || 9<2);
        System.out.println(12>7 || 9<12);
        System.out.println(12<7 || 9>12);
    }
}
