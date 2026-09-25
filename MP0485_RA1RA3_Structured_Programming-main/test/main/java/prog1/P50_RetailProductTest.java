package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class P50_RetailProductTest {

    @Test
    public void testRetailProductCalculations() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P50_RetailProduct.main(new String[0]);

        // Restore original output
        System.setOut(originalOut);

        // Process output
        String[] lines = outContent.toString().trim().split("\\r?\\n");

        assertEquals("Unexpected number of output lines", 4, lines.length);

        // Expected values (already calculated)
        String expectedLine1 = String.format(Locale.US, "Final selling price: $%.2f", 73.44);
        String expectedLine2 = String.format(Locale.US, "Total cost price: $%.2f", 60.00);
        String expectedLine3 = String.format(Locale.US, "Net profit: $%.2f", 13.44);
        String expectedLine4 = String.format(Locale.US, "Profit margin: %.2f%%", 18.30);

        assertEquals("Incorrect final selling price", expectedLine1, lines[0]);
        assertEquals("Incorrect total cost price", expectedLine2, lines[1]);
        assertEquals("Incorrect net profit", expectedLine3, lines[2]);
        assertEquals("Incorrect profit margin", expectedLine4, lines[3]);
    }
}
