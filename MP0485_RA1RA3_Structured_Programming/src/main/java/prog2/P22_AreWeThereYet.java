package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P22_AreWeThereYet.png">
 */
public class P22_AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
        } while (number != 4);
        // Write your program here
        // Hint: Loop until user enters the target location name

    }
}
