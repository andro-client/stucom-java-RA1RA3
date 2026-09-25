package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P14_DifferentTypesOfInputTest {

    @Test
    public void testDifferentTypesInputOutput() {
        // Simulate inputs: string, integer, double, boolean
        String simulatedInput = String.join("\n",
            "Hello World",
            "123",
            "3.14",
            "true"
        ) + "\n";

        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the program
        P14_DifferentTypesOfInput.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output
        String expectedOutput = String.join("\n",
            "Give a string:",
            "Give an integer:",
            "Give a double:",
            "Give a boolean:",
            "You gave the string Hello World",
            "You gave the integer 123",
            "You gave the double 3.14",
            "You gave the boolean true"
        );

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
