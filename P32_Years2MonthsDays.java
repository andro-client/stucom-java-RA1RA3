package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P32_Years2MonthsDays.png"/>
 * </div>
 */
public class P32_Years2MonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        int months = years*12;
        int days = months*30;
        System.out.println(years+" years = "+months+" months = "+days+" days");
        // Write your program here
        // Hint: Convert years to months and days, then calculate remaining days
        
        scanner.close();
    }
}
