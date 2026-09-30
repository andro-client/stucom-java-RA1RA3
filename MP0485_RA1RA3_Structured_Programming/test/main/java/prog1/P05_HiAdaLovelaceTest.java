package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P05_HiAdaLovelaceTest {

    @Test
    public void testOutput() {
        // Backup the original System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        // Redirect System.out to capture output
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P05_HiAdaLovelace.main(new String[0]);

        // Restore original System.out
        System.setOut(originalOut);

        // Expected output string
        String expected = "Hi Ada Lovelace!";

        // Normalize output for consistent line endings and trim whitespace
        String actual = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output equals expected
        assertEquals(expected, actual);
    }
}
