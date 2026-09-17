package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P16_SumOfTwoNumbers.png"/>
 * </div>
 */
public class P17_SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scanner.nextInt();
        System.out.println("Give the second number:");
        int b = scanner.nextInt();
        System.out.println("Give the third number:");
        int c = scanner.nextInt();
        int d = a+b+c;
        System.out.println("The sum of the numbers is "+d);

        // Write your program here
        // Hint: Read two numbers and print their sum

    }
}
