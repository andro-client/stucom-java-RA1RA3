package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P12_DoubleInputTest {

    @Test
    public void testDoubleInputOutput() {
        // Simulate user input: double number 3.14 (using dot as decimal separator)
        String simulatedInput = "3.14\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P12_DoubleInput.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output
        String expectedOutput = "Give a number:\nYou gave the number 3.14";

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
