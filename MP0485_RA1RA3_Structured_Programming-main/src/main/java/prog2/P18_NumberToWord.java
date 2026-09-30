package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, switch statement <hr/><br/>
 * <img src="../../../../javadoc/resources/P18_NumberToWord.png">
 */
public class P18_NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numeric grade between 0 and 10:");
        int number = scanner.nextInt();
        switch(number) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                case 10:
                    System.out.println("TEN");
                    break;
                default:
                    System.out.println("Invalid grade.");
            }

        // Write your program here
        // Hint: Use switch statement to convert number (1-7) to day names
    }
}
