package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P30_Counting.png">
 */
public class P30_Counting {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // for (variable=x; condicion que se repita = true; operacion)
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        
        // Write your program here
        // Hint: Print numbers from 1 to n using a for loop
        
    }
}
