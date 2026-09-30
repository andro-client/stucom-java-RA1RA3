package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P40_DiscountedPriceTest {

    @Test
    public void testDiscountedPrice() {
        Object[][] testCases = {
            { "true true true\n", "true" },    // all true -> discount true
            { "true false true\n", "true" },   // loyalty card & approved -> true
            { "false true true\n", "true" },   // special day & approved -> true
            { "false false true\n", "false" }, // no card, no day, approved -> false
            { "true true false\n", "false" },  // approved false -> no discount
            { "false true false\n", "false" }, // approved false -> no discount
            { "false false false\n", "false" } // all false
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            P40_DiscountedPrice.main(new String[0]);

            System.setOut(originalOut);
            System.setIn(System.in);

            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
