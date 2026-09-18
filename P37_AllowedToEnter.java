package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators and Constants</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P37_AllowedToEnter.png"/>
 * </div>
 */
public class P37_AllowedToEnter {
	// value defined as a constant
	public final static int MIN_AGE= 15;
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean banned = scanner.nextBoolean();
        
        if (age>15) {
            if (banned==false) {
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
        // Hint: Check if age >= MIN_AGE to determine entry permission
        
        scanner.close();
    }
}
