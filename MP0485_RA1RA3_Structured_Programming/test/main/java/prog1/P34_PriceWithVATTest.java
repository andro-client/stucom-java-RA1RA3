package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.Locale;

public class P34_PriceWithVATTest {

    @Test
    public void testPriceWithVAT() {
        Object[][] testCases = {
            { "100.00\n", "Total price with VAT: 121.00" },
            { "0.00\n", "Total price with VAT: 0.00" },
            { "1.00\n", "Total price with VAT: 1.21" },
            { "10.99\n", "Total price with VAT: 13.30" },
            { "49.99\n", "Total price with VAT: 60.49" }
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Redirect input
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Redirect output
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            // Run main
            P34_PriceWithVAT.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Get and normalize output
            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
