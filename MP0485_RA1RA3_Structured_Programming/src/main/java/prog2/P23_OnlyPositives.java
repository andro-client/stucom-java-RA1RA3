package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P23_OnlyPositives.png">
 */
public class P23_OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println((int) Math.pow(number, 2));
            }
        } while (number != 0);
        // Write your program here
        // Hint: Read numbers in loop and stop when user enters non-positive (0 or negative)

    }
}
