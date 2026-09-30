package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading input</strong><br/>
 *   Program to read input data <br/>
 *   <img src="../../../../javadoc/resources/P04_Message.png"/>
 * </div>
 */
public class P04_Message {

    public static void main(String[] args) {
    	// Creates a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String a = scanner.nextLine();
        System.out.println(a);
    }
}
