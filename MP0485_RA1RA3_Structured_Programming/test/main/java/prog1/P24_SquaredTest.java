package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P24_SquaredTest {

    @Test
    public void testSquaredOutput() {
        // Simulate input: 7
        String simulatedInput = "7\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P24_Squared.main(new String[0]);

        // Restore original streams
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output is just the square of 7 = 49
        String expectedOutput = "49";

        // Trim output to remove any trailing newline
        String actualOutput = outContent.toString().trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
