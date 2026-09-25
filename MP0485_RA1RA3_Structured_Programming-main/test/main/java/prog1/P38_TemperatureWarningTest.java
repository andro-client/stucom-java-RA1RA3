package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P38_TemperatureWarningTest {

    @Test
    public void testTemperatureWarning() {
        Object[][] testCases = {
            { "33\n", "true"  },  // below min temperature
            { "34\n", "false" },  // exactly min temperature
            { "35\n", "false" },  // normal range
            { "37\n", "false" },  // exactly max temperature
            { "38\n", "true"  }   // above max temperature
        };

        for (Object[] testCase : testCases) {
            String input = (String) testCase[0];
            String expectedOutput = (String) testCase[1];

            // Simulate input
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            // Capture output
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(out));

            // Run main
            P38_TemperatureWarning.main(new String[0]);

            // Restore streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Normalize output
            String actualOutput = out.toString().trim().replace("\r\n", "\n");

            // Assert output matches expected
            assertEquals("Failed for input: " + input.trim(), expectedOutput, actualOutput);
        }
    }
}
