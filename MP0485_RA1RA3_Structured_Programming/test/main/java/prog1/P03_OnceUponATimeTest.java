package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P03_OnceUponATimeTest {

    @Test
    public void testOutput() {
        // Save the original System.out print stream
        PrintStream originalOut = System.out;
        
        // Create a stream to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        // Redirect System.out to our stream
        System.setOut(new PrintStream(outContent));

        // Run the main method of the class under test
        P03_OnceUponATime.main(new String[0]);

        // Restore the original System.out
        System.setOut(originalOut);

        // Expected output as multiple lines separated by '\n'
        String expected = "Once upon a time\nthere was\na program";
        
        // Normalize output line endings (Windows uses \r\n, Unix uses \n)
        String actual = outContent.toString().replace("\r\n", "\n").trim();

        // Assert that the actual output matches expected
        assertEquals(expected, actual);
    }
}
