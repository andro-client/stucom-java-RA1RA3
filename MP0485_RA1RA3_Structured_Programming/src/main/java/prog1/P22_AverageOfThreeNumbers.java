package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P22_AverageOfThreeNumbers.png"/>
 * </div>
 */
public class P22_AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scanner.nextInt();
        System.out.println("Give the second number:");
        int b = scanner.nextInt();
        System.out.println("Give the third number:");
        int c = scanner.nextInt();
        float d = (a+b+c)/3;
        System.out.println("The average is "+d);

        // Write your program here
        // Hint: Calculate and print the average of three numbers
    }
}
