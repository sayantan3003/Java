package basics;

public class IfElseTernary {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;

        // If
        if(yes)    {
            System.out.println("Yes");
        }

        if(!no)    {
            System.out.println("Not No");
        }

        // If-Else
        if (yes) {
            System.out.println("If is executed.");
        }
        else   {
            System.out.println("Else is executed.");
        }

        // If Else-If Else
        if (yes && no) {
            System.out.println("1 == 4");
        }
        else if (no) {
            System.out.println("No");
        }
        else if (true) {
            System.out.println("Yes---");
        }
        else {
            System.out.println("last else.");
        }

        // Ternary
        // Who is bigger?
        int a = 12;
        int b = 10;
        // ?:
        int bigger = a > b ? a : b;
        System.out.println(bigger + " is bigger between " + a + " and " + b);
    }
}
