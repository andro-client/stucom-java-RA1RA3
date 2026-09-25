package main.java.prog1;

import java.util.Locale;

/**
 * <div class="block">
 * <strong>Business logic</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P47_TotalEarnings.png"/>
 * </div>
 */
public class P47_TotalEarnings {

    public static void main(String[] args) {

        // Fix the program to get the expected output
        double baseSalary = 2500.00;
        double monthlySales = 40000.00;
        double commissionRate = 0.07;
        double healthBenefit = 300.00;

        double commission = baseSalary+(monthlySales * commissionRate);
        double totalEarnings = commission + healthBenefit;

        System.out.printf(Locale.US, "Total earnings: %.2f$\n", totalEarnings);
        
    }
}
