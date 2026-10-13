package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P36_ThanksBye.png">
 */
public class P36_ThanksBye {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int numbers = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        int counter = 0;
        for (numbers = 0; numbers != -1;) {
            numbers = scanner.nextInt();
            if (numbers != -1) {
                sum = sum + numbers;
                counter++;
                if (numbers % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }

        }
        double average = (double) sum / counter;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        // Write your program here
        // Hint: Print a pattern using nested for loops
    }
}
