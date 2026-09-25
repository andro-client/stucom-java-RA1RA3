package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class P47_TotalEarningsTest {

    @Test
    public void testTotalEarningsOutputFormat() {
        // Capture the output stream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method of P47_TotalEarnings
        P47_TotalEarnings.main(new String[0]);

        // Restore original System.out
        System.setOut(originalOut);

        // Get output as string and normalize line endings
        String output = outContent.toString().replace("\r\n", "\n").trim();

        // Expected total earnings value:
        // commission = 40000 * 0.07 = 2800
        // totalEarnings = 2500 + 2800 + 300 = 5600.00
        String expectedLine = String.format(Locale.US, "Total earnings: %.2f$", 5600.00);

        // Assert output contains exactly that line (allowing only that line)
        assertEquals("Output line did not match expected total earnings line",
                     expectedLine, output);
    }
}
