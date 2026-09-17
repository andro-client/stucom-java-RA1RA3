package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading strings</strong><br/>
 *   Program execution waits for input <br/>
 *   <img src="../../../../javadoc/resources/P09_Story.png"/>
 * </div>
 */
public class P09_Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+name+", who was "+job+".");
        System.out.println("On the way to work, "+name+" reflected on life.");
        System.out.println("Perhaps "+name+" will not be "+job+" forever.");

        // Write your program here
        // Hint: Read input values and create a story using those values
    }
}
