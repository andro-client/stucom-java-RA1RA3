package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading strings</strong><br/>
 *   Program execution waits for input <br/>
 *   <img src="../../../../javadoc/resources/P08_Conversation.png"/>
 * </div>
 */
public class P08_Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String a = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String b = scanner.nextLine();
        System.out.println("Thanks for sharing!");

        // Write your program here
        // Hint: Read multiple input values and create a conversation
    }
}
