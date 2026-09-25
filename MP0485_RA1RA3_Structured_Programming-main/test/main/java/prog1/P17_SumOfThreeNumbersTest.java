package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P17_SumOfThreeNumbersTest {

    @Test
    public void testSumOfThreeNumbers_MultipleInputs() {
        Object[][] testCases = {
            { "1\n2\n3\n", "The sum of the numbers is 6" },
            { "10\n20\n30\n", "The sum of the numbers is 60" },
            { "-5\n5\n10\n", "The sum of the numbers is 10" }
        };

        for (Object[] testCase : testCases) {
            String simulatedInput = (String) testCase[0];
            String expectedLine = (String) testCase[1];

            ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
            System.setIn(inContent);

            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            // Run main method
            P17_SumOfThreeNumbers.main(new String[0]);

            // Restore original streams
            System.setOut(originalOut);
            System.setIn(System.in);

            // Prepare expected output string
            String expectedOutput = String.join("\n",
                "Give the first number:",
                "Give the second number:",
                "Give the third number:",
                expectedLine
            );

            // Normalize and trim
            String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

            assertEquals(expectedOutput, actualOutput);
        }
    }
}
