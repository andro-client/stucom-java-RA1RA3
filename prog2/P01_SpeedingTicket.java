package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, conditional <hr/><br/>
 * <img src="../../../../javadoc/resources/P01_SpeedingTicket.png">
 */
public class P01_SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();

        if (speed>120) {
            System.out.println("Speeding ticket!");
        }
        
        else {
            System.out.println("");
        }
        // Write your program here
        // Hint: Read speed and determine if it exceeds limit (e.g., 50 km/h)
    }
}
