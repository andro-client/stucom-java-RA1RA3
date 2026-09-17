package main.java.prog1;

import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators</strong><br/>
 * Program to calculate data <br/>
 * <img src="../../../../javadoc/resources/P26_RectanglePrecision.png"/>
 * </div>
 */
public class P26_RectanglePrecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator

        // Write your program here
        // Hint: Calculate rectangle area and perimeter with decimal precision
        // Read length and width
        
        // Calculate area       
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float result = (length*width);
        
        // Print result rounded to two decimal places using String.format method
        // Uncomment following line
        System.out.println(String.format(Locale.US, "%.2f", result));
        scanner.close();
    }
}
