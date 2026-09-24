package main.java.prog1;

import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Business logic</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P49_ProfitMargin.png"/>
 * </div>
 */

public class P49_ProfitMargin {
	public static void main(String[] args) {
        // Define constants for fixed values
        final double COST_PRICE = 40.0;
        final double SELLING_PRICE = 60.0;
        final double SHIPPING_COST = 5.0;   
        final double MARKETING_COST = 2.0;  
        final double DISCOUNT_RATE = 0.12;  
        
        // Fix the program to get the expected output
        // Calculate selling price after applying the discount
        double discountedSellingPrice = SELLING_PRICE * (1 - DISCOUNT_RATE);

        // Calculate profit margin based on cost price and discounted selling price
        double profitMargin = ((discountedSellingPrice - COST_PRICE) / discountedSellingPrice) * 100;

        // Print profit margin formatted to 2 decimal places
        System.out.println(String.format(Locale.US, "Profit margin: %.2f%%\n", profitMargin));
    }

}
