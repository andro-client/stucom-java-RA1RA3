package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P35_ShippingCostTest {

    @Test
    public void testShippingCost() {
        Object[][] testCases = {
            { "50\n", "false" },
            { "100\n", "false" },
            { "101\n", "true" },
            { "150\n", "true" },
            { "0\n", "false" }
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
            P35_ShippingCost.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Normalize output (trim and replace Windows line breaks)
            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
