package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P16_CounterDigits.png">
 */
public class P16_CounterDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0 && number <= 99999) {
            int i = 0;
            while (i <= 5) {
                i++;
                int digits = (int)(number / Math.pow(10, i));
                if (digits==0) {
                    System.out.println("The number has: "+i+" digits");
                    break;
                }
            }
        }
        
        else {
            System.out.println("Number out of range.");
        }
        
        // Write your program here
        // Hint: Count digits by dividing by 10 in a loop until number becomes 0
    }
}
