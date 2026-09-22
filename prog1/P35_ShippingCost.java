package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P35_ShippingCost.png"/>
 * </div>
 */
public class P35_ShippingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        if (price>100) {
            System.out.println("true");
        }
        
        else {
            System.out.println("false");
        }
        
        // Write your program here
        // Hint: Calculate total cost by adding shipping cost to product price
       
        scanner.close();
    }
}
