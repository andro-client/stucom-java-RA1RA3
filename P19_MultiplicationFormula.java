package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P19_MultiplicationFormula.png"/>
 * </div>
 */
public class P19_MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scanner.nextInt();
        System.out.println("Give the second number:");
        int b = scanner.nextInt();
        int c = a*b;
        System.out.println(a+" * "+b+" = "+c);
         

        // Write your program here
        // Hint: Apply a multiplication formula to calculate a result

    }
}
