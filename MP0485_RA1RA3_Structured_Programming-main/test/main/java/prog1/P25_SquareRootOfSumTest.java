package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P25_SquareRootOfSumTest {

    @Test
    public void testSquareRootOfSum() {
        // Simulate input: 9 and 16
        String simulatedInput = "9\n16\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main
        P25_SquareRootOfSum.main(new String[0]);

        // Restore original streams
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output is sqrt(9 + 16) = sqrt(25) = 5.0
        String expectedOutput = "5.0";

        // Trim and normalize output
        String actualOutput = outContent.toString().trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
