package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P35_Factorial.png">
 */
public class P35_Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int final_number = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= final_number; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial: "+fact);
       
    }
}

        // Write your program here
        // Hint: Calculate factorial (n! = n * (n-1) * ... * 1) using a for loop
        

