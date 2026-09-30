package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators and Constants</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P40_DiscountedPrice.png"/>
 * </div>
 */
public class P40_DiscountedPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loyaltycard = scanner.nextBoolean();
        boolean offer = scanner.nextBoolean();
        boolean approved = scanner.nextBoolean();
        
        if (loyaltycard==false) {
            if (offer==false) {
                System.out.println("false");
            }
            else if (offer==true){
               if (approved==false) {
                   System.out.println("false");
               }
               else {
                   System.out.println("true");
               }
            }
        }
        
        else if (loyaltycard==true) {
            if (approved==false) {
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
        }
        // Write your program here
        // Hint: Read price and discount percentage, then calculate final price
        
    }
}
