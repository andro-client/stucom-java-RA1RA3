package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading booleans</strong><br/>
 *   Program to input boolean as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P13_BooleanInput.png"/>
 * </div>
 */
public class P13_BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean a = scanner.nextBoolean();
        System.out.println("True or false? "+a);
        // Write your program here
        // Hint: Read a boolean value using nextBoolean() from the user and print it

    }
}
