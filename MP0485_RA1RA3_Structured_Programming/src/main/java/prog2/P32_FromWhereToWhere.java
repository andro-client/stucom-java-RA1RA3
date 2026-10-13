package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P32_FromWhereToWhere.png">
 */
public class P32_FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int whereto = scanner.nextInt();
        System.out.println("Where from? ");
        int wherefrom = scanner.nextInt();
        for (; whereto >= wherefrom; wherefrom++ ) {
            System.out.println(wherefrom);
        }

        // Write your program here
        // Hint: Print numbers from start to end (inclusive) using a for loop
        
    }
}
