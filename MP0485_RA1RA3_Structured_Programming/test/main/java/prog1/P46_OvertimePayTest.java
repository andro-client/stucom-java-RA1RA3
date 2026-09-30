package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P46_OvertimePayTest {

    @Test
    public void testOvertimePayOutput() {
        // Capture system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P46_OvertimePay.main(new String[0]);

        // Restore original output stream
        System.setOut(originalOut);

        // Get output and normalize line breaks
        String output = outContent.toString().replace("\r\n", "\n").trim();

        // Expected output strings
        String expectedOvertime = "Overtime pay: 300.0\u20AC";
        String expectedTotal = "Total pay including bonus: 400.0\u20AC";

        // Assert lines contain expected values with helpful error messages
        assertTrue("Output should contain overtime pay line: " + expectedOvertime, output.contains(expectedOvertime));
        assertTrue("Output should contain total pay line: " + expectedTotal, output.contains(expectedTotal));
    }
}
