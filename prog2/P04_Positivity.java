package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P04_Positivity.png">
 */
public class P04_Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        if (number>0) {
            System.out.println("The number is positive.");
           
        }
        
        else {
            System.out.println("The number is not positive.");
        }
        // Write your program here
        // Hint: Check if number is positive, negative, or zero using if-else
    }
}
