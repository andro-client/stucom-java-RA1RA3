package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, conditional, time logic <hr/><br/>
 * <img src="../../../../javadoc/resources/P17_NextSecond.png">
 */
public class P17_NextSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours:");
        int hours = scanner.nextInt();
        System.out.println("Enter minutes:");
        int minutes = scanner.nextInt();
        System.out.println("Enter seconds:");
        int seconds = (scanner.nextInt())+1;
        
        if (seconds==60) {
            seconds=0;
            minutes++;
        }
        
        if (minutes==60) {
            minutes=0;
            hours++;
        }
        
        if (hours==24) {
            hours=0;
        }
        
        System.out.println(hours+":"+minutes+":"+seconds);
        // Write your program here
        // Hint: Calculate next second, handling rollover at 60 seconds
    }
}
