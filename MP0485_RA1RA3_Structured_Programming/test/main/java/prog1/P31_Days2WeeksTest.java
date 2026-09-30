package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P31_Days2WeeksTest {

    @Test
    public void testDaysToWeeks() {
        Object[][] testCases = {
            { "10\n", "1 weeks and 3 days" },
            { "7\n", "1 weeks and 0 days" },
            { "0\n", "0 weeks and 0 days" },
            { "6\n", "0 weeks and 6 days" },
            { "14\n", "2 weeks and 0 days" }
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Simulate user input
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capture system output
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            // Run the program
            P31_Days2Weeks.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed on input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
