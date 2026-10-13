package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P31_CountingToHundred.png">
 */
public class P31_CountingToHundred {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);        
        int number = scanner.nextInt();
        
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
        
        /*
        Scanner scanner = new Scanner(System.in);        
        int number = scanner.nextInt();
        
        for (int i = 0; i+number <= 100; i++) {
            System.out.println(i+number);
        }
        */
        // Write your program here
        // Hint: Sum numbers from 1 to 100 using a for loop
    }
}
