package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P14_LeapYear.png">
 */
public class P14_LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = scan.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("The year is a leap year.");
        }
        
        else {
            System.out.println("The year is not a leap year.");
        }
        
        
        // Write your program here
        // Hint: Implement leap year logic with logical AND (&&) and OR (||)
        // It is divisible by 4 AND not divisible by 100
        // OR it is divisible by 400. 
        
    }
}
