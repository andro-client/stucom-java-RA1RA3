package main.java.prog1;

import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading doubles</strong><br/>
 *   Program to input double as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P12_DoubleInput.png"/>
 * </div>
 */
public class P12_DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        System.out.println("Give a number:");
        float a = scanner.nextFloat();
        System.out.println("You gave the number "+a);

        // Write your program here
        // Hint: Read a decimal number using nextDouble() from the user and print it
        

    }
}
