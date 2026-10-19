package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P45_Swap.png">
 */
public class P45_Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 3, 5, 7, 9};
        int save = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]+",");
        }
        System.out.println("\nGive the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Give the second number: ");
        int num2 = scanner.nextInt();
        
        save = numbers[num2];
        numbers[num2] = numbers[num1];
        numbers[num1] = save;
        
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]+",");
        }
        // Write your program here
        // Hint: Read two array indices and swap their values
    }   
}
