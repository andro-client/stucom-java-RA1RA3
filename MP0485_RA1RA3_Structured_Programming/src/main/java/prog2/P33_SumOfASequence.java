package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P33_SumOfASequence.png">
 */
public class P33_SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int final_number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= final_number; i++) {
            sum = sum+i;
        }
        System.out.println("The sum is "+sum);
        // Write your program here
        // Hint: Calculate sum of numbers in a sequence using a for loop
       
    }
}
