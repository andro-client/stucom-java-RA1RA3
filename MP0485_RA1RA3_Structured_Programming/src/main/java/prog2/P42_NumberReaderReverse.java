package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P42_NumberReaderReverse.png">
 */
public class P42_NumberReaderReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        // Write your program here
        // Hint: Read array size, create array, fill it, then print in reverse order
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers (in reverse order):");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
