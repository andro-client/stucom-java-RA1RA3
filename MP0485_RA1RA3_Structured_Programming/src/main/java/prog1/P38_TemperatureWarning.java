package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators and Constants</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P38_TemperatureWarning.png"/>
 * </div>
 */
public class P38_TemperatureWarning {
	public final static int MIN_TEMPERATURE= 34;
	public final static int MAX_TEMPERATURE= 37;
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp<34) {
            System.out.println("true");
        }
        else if (temp>37) {
                System.out.println("true");
            }
        else {
            System.out.println(false);
        }
        
        // Write your program here
        // Hint: Check if temperature is between MIN and MAX to show warning message
        

        scanner.close();
    }
}
