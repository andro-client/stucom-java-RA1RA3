package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P21_AverageOfTwoNumbers.png"/>
 * </div>
 */
public class P21_AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scanner.nextInt();
        System.out.println("Give the second number:");
        int b = scanner.nextInt();
        float c = (a+b)/2;
        System.out.println("The average is "+c);

        // Write your program here
        // Hint: Calculate and print the average of two numbers

    }
}
