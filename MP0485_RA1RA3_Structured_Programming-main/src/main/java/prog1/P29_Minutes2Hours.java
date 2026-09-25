package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P29_Minutes2Hours.png"/>
 * </div>
 */
public class P29_Minutes2Hours {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int hours = minutes/60;
        System.out.println(hours+" hours and "+(minutes % 60)+" minutes");
        // Write your program here
        // Hint: Convert minutes to hours and remaining minutes using / and %
        // Read number
        
        // Calculate hours and minutes

        // Print hours and minutes
        
        scanner.close();
    }
}
