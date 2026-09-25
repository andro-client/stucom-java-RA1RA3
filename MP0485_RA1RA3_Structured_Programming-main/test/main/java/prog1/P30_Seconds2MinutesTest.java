package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P30_Seconds2MinutesTest {

    @Test
    public void testSecondsToMinutes() {
        Object[][] testCases = {
            { "75\n", "1 minutes and 15 seconds" },
            { "120\n", "2 minutes and 0 seconds" },
            { "59\n", "0 minutes and 59 seconds" },
            { "0\n", "0 minutes and 0 seconds" },
            { "61\n", "1 minutes and 1 seconds" }
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Set up input stream
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capture output
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            // Run program
            P30_Seconds2Minutes.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
