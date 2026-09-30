package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P26_RectanglePrecisionTest {

    @Test
    public void testRectangleAreaWithPrecision() {
        Object[][] testCases = {
            { "3.0\n4.0\n", "12.00" },
            { "2.5\n2.5\n", "6.25" },
            { "1.333\n3.0\n", "4.00" },  // Should round to "4.00"
        };

        for (Object[] testCase : testCases) {
            String simulatedInput = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Set up simulated input
            ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
            System.setIn(inContent);

            // Capture output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            // Run main method
            P26_RectanglePrecision.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Extract output and normalize
            String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

            assertEquals(expectedOutput, actualOutput);
        }
    }
}
