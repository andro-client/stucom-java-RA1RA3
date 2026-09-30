package main.java.prog1;

import java.util.Locale;

/**
 * <div class="block">
 *   <strong>Business logic with Math.round</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P50_RetailProduct.png"/>
 * </div>
 */
public class P50_RetailProduct {
    public static final double BASE_COST = 50.0;
    public static final double PACKAGING_COST = 7.0;
    public static final double MARKETING_COST = 3.0;
    public static final double RETAIL_PRICE = 80.0;
    public static final double DISCOUNT_RATE = 0.15; 
    public static final double TAX_RATE = 0.08;      

    public static void main(String[] args) {
        // Fix the program to get the expected output
        // Total cost price including packaging and marketing
        double totalCostPrice = BASE_COST + PACKAGING_COST + MARKETING_COST;

        // Price after discount
        double discountedPrice = RETAIL_PRICE * (1 - DISCOUNT_RATE);

        // Price after adding sales tax
        double finalSellingPrice = discountedPrice * (1 + TAX_RATE);

        // Net profit per unit
        double netProfit = finalSellingPrice - totalCostPrice;

        // Profit margin 
        double profitMargin = (netProfit / finalSellingPrice) * 100;

        // Print output
        System.out.printf(Locale.US, "Final selling price: $%.2f%n", finalSellingPrice);
        System.out.printf(Locale.US, "Total cost price: $%.2f%n", totalCostPrice);
        System.out.printf(Locale.US, "Net profit: $%.2f%n", netProfit);
        System.out.printf(Locale.US, "Profit margin: %.2f%%%n", profitMargin);
        
    }

}
