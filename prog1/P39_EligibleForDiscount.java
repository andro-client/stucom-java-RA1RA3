package main.java.prog1;

import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Operators and Constants</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P39_EligibleForDiscount.png"/>
 * </div>
 */
public class P39_EligibleForDiscount {

    public final static double MIN_PURCHASE = 200.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        boolean loyaltycard = scanner.nextBoolean();
        double spent = scanner.nextDouble();
        
        if (loyaltycard==false) {
            if (spent > 200) {
                System.out.println("true");
            }
            else { 
                System.out.println("false");}
            }
        
        else {
            System.out.println("true");
        }
       
        
        // Write your program here
        // Hint: Check if purchase amount >= MIN_PURCHASE to apply discount
       

        scanner.close();
    }
}
