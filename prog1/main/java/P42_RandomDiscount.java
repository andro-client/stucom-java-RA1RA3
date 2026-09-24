package main.java.prog1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Generate random numbers with Random</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P42_RandomDiscount.png"/>
 * </div>
 */
public class P42_RandomDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        Random random = new Random();

        // Write your program here
        // Hint: Generate random discount between 1-10% using random.nextInt()
        // Random discount between 1% and 10%
        int discountPercent = random.nextInt(10) + 1; // [1,10]
        double price = scanner.nextDouble();
        double finalDiscount = 1-(discountPercent/100.00); //porque poniendo 100.00 en vez de 100 funciona?
        double finalPrice = price*finalDiscount;
        System.out.printf(Locale.US, "Discount: %d%%\n", discountPercent);
        System.out.printf(Locale.US, "Final price: %.2f\n", finalPrice);
        

        // output
        //System.out.printf(Locale.US,"Discount: %d%%\n", discountPercent);
        //System.out.printf(Locale.US,"Final price: %.2f\n", finalPrice);
        scanner.close();
    }
}
