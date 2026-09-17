package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P31_Days2Weeks.png"/>
 * </div>
 */
public class P31_Days2Weeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int weeks = days/7;
        System.out.println(weeks+" weeks and "+(days%7)+" days"); //explicación del funcionamiento exacto de %
        // Write your program here
        // Hint: Convert days to weeks and remaining days using / and %
        
        scanner.close();
    }
}
