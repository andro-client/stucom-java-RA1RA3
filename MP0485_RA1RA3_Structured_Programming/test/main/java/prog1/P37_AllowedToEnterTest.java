package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P37_AllowedToEnterTest {

    @Test
    public void testAllowedToEnter() {
        Object[][] testCases = {
            { "14\nfalse\n", "false" },  // under min age, not banned
            { "15\nfalse\n", "false" },  // exactly min age, not banned
            { "16\nfalse\n", "true"  },  // over min age, not banned
            { "16\ntrue\n",  "false" },  // over min age, banned
            { "20\nfalse\n", "true"  },  // well over min age, not banned
            { "10\ntrue\n",  "false" }   // under min age, banned
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Set up input stream
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capture output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            // Run main method
            P37_AllowedToEnter.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Normalize output
            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input:\n" + input, expectedOutput, actualOutput);
        }
    }
}
