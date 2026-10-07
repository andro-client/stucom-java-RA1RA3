package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, do while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P28_AverageOfNumbers.png">
 */
public class P28_AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        int counter = 0;
        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            if (number != 0) {
                sum = sum + number;
                counter++;
            }
        } while (number != 0);
        double average = sum / counter;
        if (counter == 0) {
            average = 0;
        }
        System.out.println("Average of the numbers: "+average);

        // Write your program here
        // Hint: Use do-while loop to read numbers and calculate average
    }
}
