package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P10_OddOrEven.png">
 */
public class P10_OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = scan.nextInt();
        if (number%2==0) {
            System.out.println("Number "+number+" is even.");
        }
        
        else {
            System.out.println("Number "+number+" is odd.");
        }
        // Write your program here
        // Hint: Use % operator to check if number % 2 == 0 (even) or not (odd)
    }
}
