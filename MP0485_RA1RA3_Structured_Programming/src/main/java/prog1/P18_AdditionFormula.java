package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P18_AdditionFormula.png"/>
 * </div>
 */
public class P18_AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scanner.nextInt();
        System.out.println("Give the second number:");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println(a+" + "+b+" = "+c);
        // Write your program here
        // Hint: Apply an addition formula (e.g., result = (a + b) * c)
    }
}
