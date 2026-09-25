package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P04_MessageTest {

    @Test
    public void testMessageInputOutput() {
        // Prepare the input to simulate user typing "Hello world"
        String simulatedInput = "Hello world\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P04_Message.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Build expected output string
        String expectedOutput = "Write a message: \nHello world";

        // Normalize line endings and trim spaces
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        assertEquals(expectedOutput, actualOutput);
    }
}
