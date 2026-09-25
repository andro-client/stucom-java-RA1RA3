package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P22_AverageOfThreeNumbersTest {

    @Test
    public void testAverageOfThreeNumbers() {
        // Simulate input: 3, 6, 9
        String simulatedInput = "3\n6\n9\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main
        P22_AverageOfThreeNumbers.main(new String[0]);

        // Restore original streams
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output
        String expectedOutput = String.join("\n",
            "Give the first number:",
            "Give the second number:",
            "Give the third number:",
            "The average is 6.0"
        );

        // Normalize line endings and trim
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert equality
        assertEquals(expectedOutput, actualOutput);
    }
}
