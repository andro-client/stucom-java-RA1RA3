package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P16_SumOfTwoNumbersTest {

    @Test
    public void testSumOutput() {
        // Simulate user input: 5 and 7
        String simulatedInput = "5\n7\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P16_SumOfTwoNumbers.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output string
        String expectedOutput = String.join("\n",
            "Give the first number:",
            "Give the second number:",
            "The sum of the numbers is 12"
        );

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
