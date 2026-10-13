package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P41_NumberReader.png">
 */
public class P41_NumberReader {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        // Write your program here
        // Hint: Use a for loop to read 5 numbers into the array
    }
}
