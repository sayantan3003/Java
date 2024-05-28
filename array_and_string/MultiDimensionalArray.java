package array_and_string;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int num1[][] = {{1,2,3}, {4,5,6}};
        int num2[][] = new int[3][4];

        for (int[] elem : num1) {
            for (int i : elem) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0 ; i<num2.length ; i++) {
            for (int j=0 ; j<num2[0].length ; j++)  {
                num2[i][j] = (int)(Math.random() * 10);
                // System.out.print(i + " ");
            }
        }

        for (int[] elem : num2) {
            for (int i : elem)  {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
