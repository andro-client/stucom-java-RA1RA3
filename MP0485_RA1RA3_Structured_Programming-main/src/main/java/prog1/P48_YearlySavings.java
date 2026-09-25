package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Business logic with Math.round</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P48_YearlySavings.png"/>
 * </div>
 */
public class P48_YearlySavings {
    public static void main(String[] args) {
    	
    	// Fix the program to get the expected output
        double monthlyEarnings = 4200.0;
        double quarterlyBonus = 1500.0;
        int months = 12;

        double coworkingCost = 250.0;
        double subscriptionCost = 300.0;
        double taxRate = 0.18;

        // 1. Gross income: monthly income + 4 quarterly bonuses
        double grossIncome = (monthlyEarnings * months) + (quarterlyBonus * 4);
        long roundedGross = Math.round(grossIncome);
 
        // 2. Net income before tax: subtract expenses
        double totalExpenses = months * (coworkingCost + subscriptionCost);
        double netBeforeTax = grossIncome - totalExpenses;
        long roundedNetBeforeTax = Math.round(netBeforeTax);

        // 3. Final earnings after tax
        double finalEarnings = netBeforeTax * (1 - taxRate);
        long roundedFinal = Math.round(finalEarnings);

        // 4. Print all rounded values
        System.out.println("Gross income: " + roundedGross + "$");
        System.out.println("Net income before tax: " + roundedNetBeforeTax + "$");
        System.out.println("Final earnings after tax: " + roundedFinal + "$");
        
    }
}
