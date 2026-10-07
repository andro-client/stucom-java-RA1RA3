package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P26_SumOfNumbers.png">
 */
public class P26_SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int last_number = 0;
        int numbers = 0;
        do {
            System.out.println("Give me a number:");
            last_number = scanner.nextInt();
            if (last_number != 0) {
                numbers = numbers + last_number;
            }
        } while (last_number != 0);
        System.out.println("Sum of the numbers: "+numbers);

        // Write your program here
        // Hint: Sum all input numbers until user enters 0
    }
}
