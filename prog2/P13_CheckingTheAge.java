package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P13_CheckingTheAge.png">
 */
public class P13_CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        if (age>=0 && age<=120) {
            System.out.println("OK");
        }
        
        else {
            System.out.println("Impossible!");
        }
        // Write your program here
        // Hint: Use logical AND (&&) to check if age is within valid range
    }
}
