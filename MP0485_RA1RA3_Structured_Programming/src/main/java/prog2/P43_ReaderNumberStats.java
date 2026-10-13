package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P43_ReaderNumberStats.png">
 */
public class P43_ReaderNumberStats {

    public static void main(String[] args) {
        // Write your program here
        // Hint: Read array, find min, max, and calculate average
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        double sumP = 0;
        double sumN = 0;
        int countP = 0;
        int countN = 0;
        int countzero = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] == 0) {
                countzero++;
            } else if (numbers[i] > 0) {
                sumP += numbers[i];
                countP++;
            } else {
                sumN += numbers[i];
                countN++;
            }
        }
        double averageP = sumP / countP;
        double averageN = sumN / countN;
        System.out.println("Average of positive numbers: " + averageP);
        System.out.println("Average of negative numbers: " + averageN);
        System.out.println("Count of zeros: " + countzero);
    }
}
