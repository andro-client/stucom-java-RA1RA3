package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P36_IsDriverTest {

    @Test
    public void testIsDriver() {
        Object[][] testCases = {
            { "17\ntrue\n",  "false" },  // under 18 but has license
            { "18\ntrue\n",  "true"  },  // exactly 18 and has license
            { "20\nfalse\n", "false" },  // over 18 but no license
            { "22\ntrue\n",  "true"  },  // over 18 and has license
            { "16\nfalse\n", "false" }   // under 18 no license
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
            P36_IsDriver.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Normalize output
            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            assertEquals("Failed for input:\n" + input, expectedOutput, actualOutput);
        }
    }
}
