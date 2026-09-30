package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P39_EligibleForDiscountTest {

    @Test
    public void testEligibleForDiscount() {
        Object[][] testCases = {
            { "true 100.00\n", "true" },   // has loyalty card, amount < min
            { "false 250.00\n", "true" },  // no card, amount > min
            { "false 150.00\n", "false" }, // no card, amount < min
            { "true 300.00\n", "true" }    // has card and amount > min
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            P39_EligibleForDiscount.main(new String[0]);

            System.setOut(originalOut);
            System.setIn(System.in);

            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
