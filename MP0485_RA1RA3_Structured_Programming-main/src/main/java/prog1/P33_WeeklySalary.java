package main.java.prog1;
import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P33_WeeklySalary.png"/>
 * </div>
 */
public class P33_WeeklySalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        int hours = scanner.nextInt();
        double rate = scanner.nextDouble();
        System.out.printf(Locale.US, "Weekly salary: %.2f\n", (hours*rate)); //printf??
        // Write your program here
        // Hint: Calculate weekly salary by multiplying hourly rate by 40 hours
        
        scanner.close();
    }
}
