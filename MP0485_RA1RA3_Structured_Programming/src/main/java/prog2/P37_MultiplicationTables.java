package main.java.prog2;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P37_MultiplicationTables.png">
 */
public class P37_MultiplicationTables {

    public static void main(String[] args) {
        final String LINES = "----------------------------";
        int table_number = 0;
        int mult_number = 0;
        for (table_number = 1; table_number <= 10; table_number++) {
            System.out.println("\n\nMultiplication Table of " + table_number);
            System.out.println(LINES);
            for (mult_number = 1; mult_number <= 10; mult_number++) {
                System.out.println(table_number + " x " + mult_number + " = " + (table_number * mult_number));
            }
        }
        // Write your program here
        // Hint: Use nested for loops to print multiplication table (1-10)

    }
}
