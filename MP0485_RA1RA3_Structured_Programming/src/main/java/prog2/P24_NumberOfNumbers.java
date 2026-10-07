package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P24_NumberOfNumbers.png">
 */
public class P24_NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Give a number:");
        int number = scanner.nextInt();

        for (i = 0; number != 0; i++) {
            System.out.println("Give a number:");
            number = scanner.nextInt();
        }
        System.out.println("Number of numbers: " + i);

        // Write your program here
        // Hint: Count how many numbers are input until user enters 0
    }
}
