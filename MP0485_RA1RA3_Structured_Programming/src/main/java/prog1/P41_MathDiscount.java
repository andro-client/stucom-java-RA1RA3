package main.java.prog1;
import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Generate random numbers with Math</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P41_MathDiscount.png"/>
 * </div>
 */
public class P41_MathDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        double price = scanner.nextDouble();
        
        // Write your program here
        // Hint: Generate random discount between 1-10% using Math.random()
        // Random discount between 1% and 10%
        double discountPercent = 1 + Math.random() * 9;
        double finalPrice = price*(1-(discountPercent/100));
        System.out.printf(Locale.US,"Discount: %.2f%%\n", discountPercent);
        System.out.printf(Locale.US,"Final price: %.2f\n", finalPrice);
        
        

        // output
        //System.out.printf(Locale.US,"Discount: %.2f%%\n", discountPercent);
        //System.out.printf(Locale.US,"Final price: %.2f\n", finalPrice);

        scanner.close();
    }

}
