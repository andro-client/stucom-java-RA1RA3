package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P49_ProfitMarginTest {

    @Test
    public void testProfitMarginOutput() {
        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P49_ProfitMargin.main(new String[0]);

        // Restore original System.out
        System.setOut(originalOut);

        String output = outContent.toString().trim();

        // Expected profit margin calculation:
        // discountedSellingPrice = 60 * (1 - 0.12) = 60 * 0.88 = 52.8
        // profitMargin = ((52.8 - 40) / 52.8) * 100 ≈ 24.24

        String expected = "Profit margin: 24.24%";

        assertEquals("Output did not match expected profit margin line.", expected, output);
    }
}
