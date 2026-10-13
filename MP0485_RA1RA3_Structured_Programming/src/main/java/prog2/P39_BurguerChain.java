package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P39_BurguerChain.png">
 */
public class P39_BurguerChain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restaurants = 3;
        int days = 7;

        System.out.println("Weekly Burger Sales Report");
        int sum = 0;
        for (int restaurant = 1; restaurant <= restaurants; restaurant++) {
            System.out.println("Restaurant " + restaurant + ":");
            for (int day = 1; day <= days; day++) {
                System.out.println("Enter sales for day " + day + ":");
                int burgers = scanner.nextInt();
                if (burgers < 50) {
                    System.out.println(burgers + "!");
                } else {
                    System.out.println(burgers);
                }
                sum = sum + burgers;
                if (day == 7) {
                    System.out.println("Total: " + sum + " burgers");
                    sum = 0;
                }
            }
        }

        // Write your program here
        // Hint: Use nested loops to display restaurant sales for each day
    }
}
