package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P44_CheckOrder.png">
 */
public class P44_CheckOrder {

    public static void main(String[] args) {

        // Write your program here
        // Hint: Read array and check if it's sorted in ascending order
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int increase = 0;
        int decrease = 0;
        int equality = 0;
        System.out.println("Reading numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: ");
            numbers[i] = scanner.nextInt();
        }
        if (numbers[0] < numbers[1]) {
            increase++;
        } else if (numbers[0] > numbers[1]) {
            decrease++;
        } else {
            equality++;
        }
        if (numbers[1] < numbers[2]) {
            increase++;
        } else if (numbers[1] > numbers[2]) {
            decrease++;
        } else {
            equality++;
        }
        if (numbers[2] < numbers[3]) {
            increase++;
        } else if (numbers[2] > numbers[3]) {
            decrease++;
        } else {
            equality++;
        }
        if (numbers[3] < numbers[4]) {
            increase++;
        } else if (numbers[3] > numbers[4]) {
            decrease++;
        } else {
            equality++;
        }
        if (increase == 4) {
            System.out.println("Increasing sequence.");
        } else if (decrease == 4) {
            System.out.println("Decreasing sequence.");
        } else if (equality == 4) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("Unordered sequence.");
        }
    }
}
