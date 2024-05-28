package array_and_string;

public class JaggedArray {
    public static void main(String[] args) {
        int num1[][] = new int[4][];
        num1[0] = new int[2];
        num1[1] = new int[1];
        num1[2] = new int[4];
        num1[3] = new int[3];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                num1[i][j] = (int) (Math.random()*10);
            }
        }

        for (int[] oe : num1) {
            for (int ie : oe) {
                System.out.print(ie + " ");
            }
            System.out.println();
        }
    }
}
