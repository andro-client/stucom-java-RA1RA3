package main.java.prog1;

import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Type conversions</strong><br/>
 *   Program to calculate data with Math methods<br/>
 *   <img src="../../../../javadoc/resources/P27_NumberPow.png"/>
 * </div>
 */
public class P27_NumberPow {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = Math.pow(a, 2);
        double c = Math.pow(a, 3);
        double d = Math.pow(a, 4);
        System.out.println((int)b);
        System.out.println((int)c);
        System.out.println((int)d);
        
        // Write your program here
        // Hint: Use Math.pow() to calculate powers of a number
        // Read number
                
        // Calculate pows using double format        

        // Print result of three pows as integer
                
        scanner.close();
    }
}
