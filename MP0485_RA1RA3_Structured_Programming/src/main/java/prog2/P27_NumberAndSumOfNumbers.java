package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, do while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P27_NumberAndSumOfNumbers.png">
 */
public class P27_NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int counter = 0;

        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            if (number != 0) {
                sum = sum + number;
                counter++;
            }
        } while (number != 0);
        System.out.println("Number of numbers: "+counter);
        System.out.println("Sum of the numbers: "+sum);

        // Write your program here
        // Hint: Use do-while to read numbers and print count and sum
    }
}
