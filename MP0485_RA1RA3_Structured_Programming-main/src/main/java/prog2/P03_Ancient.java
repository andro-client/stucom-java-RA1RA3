package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, comparison operators <hr/><br/>
 * <img src="../../../../javadoc/resources/P03_Ancient.png">
 */
public class P03_Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        
        if (year<2015) {
            System.out.println("Ancient history!");
        }
        
        else {
            System.out.println("");
        }

        // Write your program here
        // Hint: Check if a year is before a certain ancient period threshold
    }
}
