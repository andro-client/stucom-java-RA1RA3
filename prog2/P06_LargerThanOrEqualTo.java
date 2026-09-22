package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P06_LargerThanOrEqualTo.png">
 */
public class P06_LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int number1 = scan.nextInt();
        System.out.println("Give the second number: ");
        int number2 = scan.nextInt();
        
        if (number1>number2) {
            System.out.println("Greater number is: "+number1);
        }
        
        else if (number1<number2) {
            System.out.println("Greater number is: "+number2);
        }
        
        else {
            System.out.println("The numbers are equal!");
        }
        
        // Write your program here
        // Hint: Compare two numbers and check if first is >= second
    }
}
