package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P36_IsDriver.png"/>
 * </div>
 */
public class P36_IsDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isdriver = scanner.nextBoolean();
        
        if (age>=18) {
            if (isdriver==true) {
                    System.out.println("true");        
            }
            else {
                System.out.println("false");
            }
        }
        
        else {
            System.out.println("false");
        }
        
        // Write your program here
        // Hint: Check if age >= 18 to determine if eligible to drive

        scanner.close();
    }
}
