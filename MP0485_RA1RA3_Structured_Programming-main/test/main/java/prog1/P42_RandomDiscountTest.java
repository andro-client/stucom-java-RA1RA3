package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Locale;

public class P42_RandomDiscountTest {

    @Test
    public void testOutputFormatAndRange() {
        // Simulate user input: price 150.00
        String input = "150.00\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P42_RandomDiscount.main(new String[0]);

        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Get output lines
        String[] lines = outContent.toString().trim().split("\\r?\\n");
        assertEquals("Expected 2 output lines", 2, lines.length);

        String discountLine = lines[0].trim();   // e.g. Discount: 3.52%
        String finalPriceLine = lines[1].trim(); // e.g. Final price: 144.72

        // Check discount line format
        assertTrue("Discount line should start with 'Discount:'", discountLine.startsWith("Discount:"));
        assertTrue("Discount line should end with '%'", discountLine.endsWith("%"));

        // Extract discount percent (double)
        String discountStr = discountLine.substring("Discount:".length(), discountLine.length() - 1).trim();
        double discountPercent = Double.parseDouble(discountStr);

        // Check discount range [0,10), we expect (0,10) but Math.random()*10 could be 0.0
        assertTrue("Discount percent should be >= 0.0", discountPercent >= 0.0);
        assertTrue("Discount percent should be < 10.0", discountPercent <= 10.0);

        // Check final price line format
        assertTrue("Final price line should start with 'Final price:'", finalPriceLine.startsWith("Final price:"));

        // Extract final price (double)
        String finalPriceStr = finalPriceLine.substring("Final price:".length()).trim();
        double finalPrice = Double.parseDouble(finalPriceStr);

        // Original price
        double originalPrice = 150.00;

        // Calculate expected final price
        double expectedFinalPrice = originalPrice - (originalPrice * (discountPercent / 100.0));

        // Assert final price is close to expected (allow small rounding difference)
        assertEquals(expectedFinalPrice, finalPrice, 0.01);
    }
}
