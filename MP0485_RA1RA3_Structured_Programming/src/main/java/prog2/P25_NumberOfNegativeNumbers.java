package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P25_NumberOfNegativeNumbers.png">
 */
public class P25_NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            if (number < 0) {
                counter++;
            }
        } while (number != 0);
        System.out.println("Number of negative numbers: " + counter);

        // Write your program here
        // Hint: Count negative numbers until user enters 0
    }
}
