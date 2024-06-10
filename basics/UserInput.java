package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * <ClassName>.main()   --> It is called by JVM
 */

public class UserInput {
    public static void main(String[] args) throws IOException {
        
        //println is a method of PrintStream class
        // System class has an static final object of PrintStream class
        System.out.println("Hello");

    /*
        // return int throw IOException
        // Reading 1 character at a time
        int num = System.in.read();   // It returns ASCII value of 1st character
        System.out.println(num);
    */

    /*

        // Read String
        // Creating object of Reader
        InputStreamReader in = new InputStreamReader(System.in);

        // Read -> You are opening a resource -> It is your responsibility to close
        BufferedReader bf = new BufferedReader(in);

        System.out.println("Enter anything: ");
        String input1 = bf.readLine();
        System.out.println(input1);

        // Closing Resource
        bf.close();
    */

        // Taking console input in a better way
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(number);
        sc.close();
    }
}
