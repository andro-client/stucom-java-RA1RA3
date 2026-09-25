package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P07_GradesAndPoints.png">
 */
public class P07_GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if (grade >= 50 && grade <= 59) {
            System.out.println("Grade: 1");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println("Grade: 2");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println("Grade: 3");
        }
        else if (grade >= 80 && grade <= 89) {
            System.out.println("Grade: 4");
        }
        else if (grade >= 90 && grade <= 100) {
            System.out.println("Grade: 5");
        }
        else if (grade >= 100) {
            System.out.println("incredible! ");
        }
        else if (grade <= 49 && grade >= 0) {
            System.out.println("failed");
        }
        else {
            System.out.println("impossible!");
        }
        
        
        // Write your program here
        // Hint: Convert grade to points (A=5, B=4, C=3, D=2, F=1) using if-else
    }
}
