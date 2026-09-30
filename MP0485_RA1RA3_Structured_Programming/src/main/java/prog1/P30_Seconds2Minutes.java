package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P30_Seconds2Minutes.png"/>
 * </div>
 */
public class P30_Seconds2Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds/60;
        System.out.println(minutes+" minutes and "+(seconds % 60)+" seconds");
        
        // Write your program here
        // Hint: Convert seconds to minutes and seconds using / and %
        
        scanner.close();
    }
}
