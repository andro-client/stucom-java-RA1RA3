package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P29_Minutes2HoursTest {

    @Test
    public void testConversion() {
        Object[][] testCases = {
            { "90\n", "1 hours and 30 minutes" },
            { "120\n", "2 hours and 0 minutes" },
            { "45\n", "0 hours and 45 minutes" },
            { "0\n", "0 hours and 0 minutes" },
            { "61\n", "1 hours and 1 minutes" }
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Simulate input
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capture output
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            // Execute main method
            P29_Minutes2Hours.main(new String[0]);

            // Restore System.in and System.out
            System.setIn(System.in);
            System.setOut(System.out);

            // Trim and normalize line endings
            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed on input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
