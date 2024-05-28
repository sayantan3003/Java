package basics;

import java.util.Scanner;

/**
 * Loop - while, do while, for
 */
public class Loops {
    public static void main(String[] args) {
        // while loop
        int counter = 1;
        while(counter <= 4) {
            System.out.println(counter);
            counter++;
        }

        // do-while loop
        String password = "Sayantan";
        String guessedPassword;
        boolean locked = true;
        Scanner sc = new Scanner(System.in);
        do   {
            System.out.println("Guess my password: ");
            guessedPassword = sc.nextLine();

            if (password.equals(guessedPassword))   {
                System.out.println("System is Unlocked...");
                locked = false;
            }
            else    {
                System.out.println("OOPS!\nWrong password, Please try again...");
            }
        }   while (locked);
        

        // for loop
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        for( byte i=0 ; i<name.length() ; i++ ) {
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
}
