package main.java.prog1;

import java.util.Scanner;
import java.util.Locale;

/**
 * <div class="block">
 *   <strong>Reading different data</strong><br/>
 *   Program to input different data as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P14_DifferentTypesOfInput.png"/>
 * </div>
 */
public class P14_DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Give a string:");
        String a = scan.nextLine();
        System.out.println("Give an integer:");
        int b = scan.nextInt();
        System.out.println("Give a double:");
        double c = scan.nextDouble();
        System.out.println("Give a boolean:");
        boolean d = scan.nextBoolean();
        System.out.println("You gave the string "+a);
        System.out.println("You gave the integer "+b);
        System.out.println("You gave the double "+c); 
        System.out.println("You gave the boolean "+d);

        // Write your program here
        // Hint: Read different data types (int, double, String, boolean) and print them

    }
}
