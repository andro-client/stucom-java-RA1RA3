package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P15_GiftTax.png">
 */
public class P15_GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        
        if (value>=5000 && value<25000) {
            double tax = 100;
            double taxrate = 0.08;
            int valuemin = 5000;
            System.out.println("Tax: "+(tax+(value-valuemin)*taxrate));
        }
        else if (value>=25000 && value<55000) {
            double tax = 1700;
            double taxrate = 0.10;
            int valuemin = 25000;
            System.out.println("Tax: "+(tax+(value-valuemin)*taxrate));
        }
        else if (value>=55000 && value<200000) {
            double tax = 4700;
            double taxrate = 0.12;
            int valuemin = 55000;
            System.out.println("Tax: "+(tax+(value-valuemin)*taxrate));
        }
        else if (value>=200000 && value<1000000) {
            double tax = 22100;
            double taxrate = 0.15;
            int valuemin = 200000;
            System.out.println("Tax: "+(tax+(value-valuemin)*taxrate));
        }
        else if (value>=1000000) {
            double tax = 142100;
            double taxrate = 0.17;
            int valuemin = 1000000;
            System.out.println("Tax: "+(tax+(value-valuemin)*taxrate));
        }
        
        else {
            System.out.println("No tax!");
        }
        // Write your program here
        // Hint: Calculate gift tax based on amount thresholds using if-else
    }
}
