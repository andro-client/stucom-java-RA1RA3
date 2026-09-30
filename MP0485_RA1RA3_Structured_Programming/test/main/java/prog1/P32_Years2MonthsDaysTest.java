package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P32_Years2MonthsDaysTest {

    @Test
    public void testYearsToMonthsDays() {
        Object[][] testCases = {
            { "1\n", "1 years = 12 months = 360 days" },
            { "2\n", "2 years = 24 months = 720 days" },
            { "0\n", "0 years = 0 months = 0 days" },
            { "5\n", "5 years = 60 months = 1800 days" },
            { "10\n", "10 years = 120 months = 3600 days" }
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Simulate input
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capture output
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            // Run the program
            P32_Years2MonthsDays.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
