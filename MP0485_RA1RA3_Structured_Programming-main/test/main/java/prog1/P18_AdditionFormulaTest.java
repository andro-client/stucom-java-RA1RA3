package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P18_AdditionFormulaTest {

    @Test
    public void testAdditionFormulaOutput() {
        // Simulate user input: 8 and 7
        String simulatedInput = "8\n7\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P18_AdditionFormula.main(new String[0]);

        // Restore original streams
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output string
        String expectedOutput = String.join("\n",
            "Give the first number:",
            "Give the second number:",
            "8 + 7 = 15"
        );

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert the output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
