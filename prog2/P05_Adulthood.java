package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P05_Adulthood.png">
 */
public class P05_Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        
        if (age>=18) {
            System.out.println("You are an adult");
        }
        
        else {
            System.out.println("You are not an adult");
        }
        // Write your program here
        // Hint: Check if age >= 18 to determine if person is adult
    }
}
