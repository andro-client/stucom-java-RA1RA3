package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P27_NumberPowTest {

    @Test
    public void testPowerOutputs() {
        Object[][] testCases = {
            { "2\n", new String[] { "4", "8", "16" } },
            { "3\n", new String[] { "9", "27", "81" } },
            { "5\n", new String[] { "25", "125", "625" } }
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String[] expectedLines = (String[]) testCase[1];

            // Set up simulated input
            ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
            System.setIn(inContent);

            // Capture output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            // Run the main method
            P27_NumberPow.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Get and normalize output
            String[] outputLines = outContent.toString().trim().split("\\r?\\n");

            assertArrayEquals("Output mismatch for input: " + input.trim(), expectedLines, outputLines);
        }
    }
}
