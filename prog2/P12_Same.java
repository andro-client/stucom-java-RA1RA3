package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P12_Same.png">
 */
public class P12_Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String phrase1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String phrase2 = scan.nextLine();
        
        if (phrase1.equals(phrase2)) {
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }
        // Write your program here
        // Hint: Check if two input strings are identical
    }
}
