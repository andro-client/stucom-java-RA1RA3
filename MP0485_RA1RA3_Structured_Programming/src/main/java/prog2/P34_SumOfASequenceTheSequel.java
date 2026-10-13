package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P34_SumOfASequenceTheSequel.png">
 */
public class P34_SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int new_first_number = 0;
        System.out.println("First number?");
        int first_number = scanner.nextInt();
        System.out.println("Last number?");
        int final_number = scanner.nextInt();
        for (int i = first_number+1; i <= final_number; i++) {
            first_number = first_number + i;
        }
        System.out.println("The sum is "+(first_number));
        // Write your program here
        // Hint: Sum numbers using formula or loop (more complex pattern)
    }
}
