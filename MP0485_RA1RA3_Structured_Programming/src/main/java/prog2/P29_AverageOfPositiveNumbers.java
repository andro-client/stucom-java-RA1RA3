package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P29_AverageOfPositiveNumbers.png">
 */
public class P29_AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        double average = 0;
        int counter = 0;
        do {
            number = scanner.nextInt();
            if (number > 0) {
                sum = sum + number;
                counter++;
            } else if (sum == 0 && counter == 0) {
                System.out.println("Cannot calculate the average");
            } else {
            }
        } while (number != 0);
        average = sum / counter;
        System.out.println(average);
        // Write your program here
        // Hint: Calculate average of only positive numbers input

    }
}
