package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading strings</strong><br/>
 *   Program to input string as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P07_Greeting.png"/>
 * </div>
 */
public class P07_Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String a = scanner.nextLine();
        System.out.println("Hi "+a);

        // Write your program here
        // Hint: Read a name and print a greeting message with it
    }
}
