package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P27_NumberAndSumOfNumbersTest {

    private void testOutput(String input, String expectedNumberOutput, String expectedSumOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P27_NumberAndSumOfNumbers.main(new String[0]);

            String output = outContent.toString();
            assertTrue("Expected number output not found. Output was:\n" + output,
                    output.contains(expectedNumberOutput));
            assertTrue("Expected sum output not found. Output was:\n" + output,
                    output.contains(expectedSumOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testNoNumbers() {
        testOutput("0\n",
                "Number of numbers: 0",
                "Sum of the numbers: 0");
    }

    @Test(timeout = 1000)
    public void testPositiveNumbers() {
        testOutput("3\n4\n5\n0\n",
                "Number of numbers: 3",
                "Sum of the numbers: 12");
    }

    @Test(timeout = 1000)
    public void testNegativeNumbers() {
        testOutput("-2\n-3\n-5\n0\n",
                "Number of numbers: 3",
                "Sum of the numbers: -10");
    }

    @Test(timeout = 1000)
    public void testMixedNumbers() {
        testOutput("10\n-5\n3\n0\n",
                "Number of numbers: 3",
                "Sum of the numbers: 8");
    }
}
