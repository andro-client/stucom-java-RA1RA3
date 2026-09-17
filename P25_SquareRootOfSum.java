package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P25_SquareRootOfSum.png"/>
 * </div>
 */
public class P25_SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sqrt = Math.sqrt(a+b);
        System.out.println(sqrt);
        
        // Write your program here
        // Hint: Read two numbers, sum them, and print the square root using Math.sqrt()
    }
}
