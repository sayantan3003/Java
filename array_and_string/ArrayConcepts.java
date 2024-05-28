package array_and_string;

public class ArrayConcepts {
    public static void main(String[] args) {
        // Mutiple ways to define an array with values
        int[] num1 = {1, 2, 3, 4};
        int [] num2 = {1, 2, 3, 4};
        int []num3 = {1, 2, 3, 4};
        int num4[] = {1, 2, 3, 4};
        int num5 [] = {1, 2, 3, 4};

        System.out.println(num1[3]);
        System.out.println(num2[3]);
        System.out.println(num3[3]);
        System.out.println(num4[3]);
        System.out.println(num5[3]);

        // Array w/o values
        int[] num6 = new int[5];
        for (int i : num6) {
            System.out.print(i + " ");
        }
    }
}
