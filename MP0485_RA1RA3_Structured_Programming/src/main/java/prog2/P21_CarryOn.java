package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P21_CarryOn.png">
 */
public class P21_CarryOn {

    public static void main(String[] args) {
        System.out.println("Shall we carry on?");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String output = scanner.nextLine();
            // == y != no funciona si la variable es un String
            // (statement).equals(variable or value);
            boolean carryon = (!"no".equals(output));
            if (carryon == false) {
                break;
            }
            System.out.println("Shall we carry on?");
            // Write your program here
            // Hint: Read yes/no input and break loop if user says no
        }
    }
}
