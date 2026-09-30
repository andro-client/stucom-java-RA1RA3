package main.java.prog2;

import java.time.Year;
import java.util.Scanner;

/**
 * <b>Content</b> flow control, date logic with Year class <hr/><br/>
 * <img src="../../../../javadoc/resources/P20_AccurateNextDate.png">
 */
public class P20_AccurateNextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day:");
        int day = (scanner.nextInt())+1;
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        boolean leap = Year.isLeap(year);
        
        switch (month){
            case 1:
                int january=31;
                if (day>january) {
                    day=0;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 2:
                int february=28;
                if (leap==true) {
                    february=february+1;
                    if (day>february) {
                        day=1;
                        month=month+1;
                        System.out.println(day+"/"+month+"/"+year);
                    }
                    else {
                        System.out.println(day+"/"+month+"/"+year);
                    }
                }
                else {
                    if (day>february) {
                        day=1;
                        month=month+1;
                        System.out.println(day+"/"+month+"/"+year);
                    }
                    else {
                        System.out.println(day+"/"+month+"/"+year);
                    }
                }
            break;
            case 3:
                int march=31;
                if (day>march) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 4:
                int april=30;
                if (day>april) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 5:
                int may=31;
                if (day>may) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 6:
                int june=30;
                if (day>june) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 7:
                int july=31;
                if (day>july) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 8:
                int august=31;
                if (day>august) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 9:
                int september=30;
                if (day>september) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 10:
                int october=31;
                if (day>october) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 11:
                int november=30;
                if (day>november) {
                    day=1;
                    month=month+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
            case 12:
                int december=31;   
                if (day>december) {
                    day=1;
                    month=1;
                    year=year+1;
                    System.out.println(day+"/"+month+"/"+year);
                }
                else {
                    System.out.println(day+"/"+month+"/"+year);
                }
            break;
        }

        
                
        
        // Write your program here
        // Hint: Use Year.isLeap() to calculate accurate next date with proper month lengths
        
    }    
}
