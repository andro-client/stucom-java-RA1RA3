package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P08_AbsoluteValue.png">
 */
public class P08_AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number>=0) {
            System.out.println(number);
        }
        
        else {
            System.out.println(number*-1);
        }
        // Write your program here
        // Hint: Use if-else to print absolute value (negate if negative)
    }
}
