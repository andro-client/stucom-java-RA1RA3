package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P15_SecondsInADayTest {

    @Test
    public void testSecondsCalculation() {
        // Simulate input: 2 days
        String simulatedInput = "2\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P15_SecondsInADay.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Calculate expected seconds: 2 days * 24 * 60 * 60 = 172800
        String expectedOutput = "How many days would you like to convert to seconds?\n172800";

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
