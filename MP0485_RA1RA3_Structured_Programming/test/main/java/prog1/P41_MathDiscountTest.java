package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Locale;

public class P41_MathDiscountTest {

    @Test
    public void testDiscountOutput() {
        String input = "100.00\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P41_MathDiscount.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        String[] lines = out.toString().trim().split("\\r?\\n");
        assertEquals("Output should have 2 lines", 2, lines.length);

        // Example lines:
        // Discount: 3.24%
        // Final price: 96.76

        // Parse discount
        String discountLine = lines[0];
        String finalPriceLine = lines[1];

        assertTrue(discountLine.startsWith("Discount:"));
        assertTrue(finalPriceLine.startsWith("Final price:"));

        // Extract discount percentage as double
        String discountPercentStr = discountLine.replace("Discount:", "").replace("%", "").trim();
        double discountPercent = Double.parseDouble(discountPercentStr);

        // Extract final price
        String finalPriceStr = finalPriceLine.replace("Final price:", "").trim();
        double finalPrice = Double.parseDouble(finalPriceStr);

        // Original price is 100.00 from input
        double originalPrice = 100.00;

        // Check discount is between 0 and 10 (or 1 and 10 if you want)
        assertTrue("Discount percent should be >= 0", discountPercent >= 0);
        assertTrue("Discount percent should be <= 10", discountPercent <= 10);

        // Calculate expected final price
        double expectedFinalPrice = originalPrice * (1 - discountPercent / 100);

        // Allow small floating point delta
        assertEquals(expectedFinalPrice, finalPrice, 0.01);
    }
}
