package main.java.prog1;
import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P34_PriceWithVAT.png"/>
 * </div>
 */
public class P34_PriceWithVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        double price = scanner.nextDouble();
        double pricef = price*1.21;
        System.out.printf(Locale.US, "Total price with VAT: %.2f", pricef); //porque funciona así y no con +pricef?
        
        // Write your program here
        // Hint: Calculate final price by adding VAT (21%) to the base price
        
        scanner.close();
    }
}
