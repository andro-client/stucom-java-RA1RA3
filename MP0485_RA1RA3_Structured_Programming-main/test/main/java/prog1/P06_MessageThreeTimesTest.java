package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P06_MessageThreeTimesTest {

    @Test
    public void testMessagePrintedThreeTimes() {
        // Simulate user input
        String simulatedInput = "Hello\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the program
        P06_MessageThreeTimes.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output (prompt + message printed 3 times)
        String expectedOutput = "Write a message:\nHello\nHello\nHello";

        // Normalize line endings and trim
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert equality
        assertEquals(expectedOutput, actualOutput);
    }
}
