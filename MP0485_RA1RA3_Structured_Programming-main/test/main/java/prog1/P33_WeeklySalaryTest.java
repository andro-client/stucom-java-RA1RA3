package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Locale;

public class P33_WeeklySalaryTest {

    @Test
    public void testWeeklySalary() {
        Object[][] testCases = {
            { "40\n15.5\n", "Weekly salary: 620.00" },
            { "0\n10.0\n", "Weekly salary: 0.00" },
            { "35\n8.75\n", "Weekly salary: 306.25" },
            { "20\n20.0\n", "Weekly salary: 400.00" },
            { "37\n12.34\n", "Weekly salary: 456.58" }
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
            P33_WeeklySalary.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Normalize output
            String actualOutput = out.toString().trim().replace("\r\n", "\n");
            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
