package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P09_ComparingNumbers.png">
 */
public class P09_ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        if (number1>number2) {
            System.out.println(number1+" is greater than "+number2+".");
        }
        
        else if (number1<number2) {
            System.out.println(number1+" is smaller than "+number2+".");
        }
        
        else {
            System.out.println(number1+" is equal to "+number2+".");
        }
        // Write your program here
        // Hint: Compare three numbers and print the largest one
    }
}
