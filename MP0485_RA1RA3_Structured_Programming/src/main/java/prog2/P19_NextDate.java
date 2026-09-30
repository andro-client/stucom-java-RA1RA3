package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b>: flow control, date logic (fixed 30-day months)<br/>
 * <img src="../../../../javadoc/resources/P19_NextDate.png"/>
 */
public class P19_NextDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = (scanner.nextInt())+1;
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        
        if (day>=30) {
            day = 1;
            month = month+1;
        }
        if (month>=12) {
            month = 1;
            year = year+1;
        }
        System.out.println(day+"/"+month+"/"+year);

        // Write your program here
        // Hint: Calculate next date handling day/month/year rollover (assume 30 days/month)
       
    }
}
