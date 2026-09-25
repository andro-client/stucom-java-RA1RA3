package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P28_TenDigits.png"/>
 * </div>
 */
public class P28_TenDigits {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println((N/10)%10);
        // Write your program here
        // Hint: Use the remainder operator (%) to extract the tens digit
        // Read number
        
        // Calculate ten digit using remainder operator

        // Print ten digits of number
        
        scanner.close();
    }
}
