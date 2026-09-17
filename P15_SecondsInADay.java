package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P15_SecondsInADay.png"/>
 * </div>
 */
public class P15_SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int a = scanner.nextInt();
        System.out.println(a*60*60*24);
        // Write your program here
        // Hint: Calculate the total seconds in a given number of days
    }
}
