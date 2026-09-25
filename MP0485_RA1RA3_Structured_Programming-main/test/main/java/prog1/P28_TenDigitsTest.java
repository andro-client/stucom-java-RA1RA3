package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P28_TenDigitsTest {

    @Test
    public void testTensDigit() {
        Object[][] testCases = {
            { "123\n", "2" },     // 12 / 10 = 12 % 10 = 2
            { "9876\n", "7" },    // 987 / 10 = 987 % 10 = 7
            { "50\n", "5" },      // 50 / 10 = 5 % 10 = 5
            { "9\n", "0" },       // 9 / 10 = 0 % 10 = 0
            { "105\n", "0" }      // 105 / 10 = 10 % 10 = 0
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Simulate user input
            ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
            System.setIn(inContent);

            // Capture program output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            // Execute the main method
            P28_TenDigits.main(new String[0]);

            // Restore original System.out and System.in
            System.setOut(originalOut);
            System.setIn(System.in);

            // Normalize and get output
            String actualOutput = outContent.toString().trim();

            // Assert result
            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
