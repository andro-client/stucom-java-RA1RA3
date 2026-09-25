package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P19_MultiplicationFormulaTest {

    @Test
    public void testMultiplicationFormulaOutput() {
        // Simulate user input: 6 and 9
        String simulatedInput = "6\n9\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P19_MultiplicationFormula.main(new String[0]);

        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output string
        String expectedOutput = String.join("\n",
            "Give the first number:",
            "Give the second number:",
            "6 * 9 = 54"
        );

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
