package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P29_AverageOfPositiveNumbersTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P29_AverageOfPositiveNumbers.main(new String[0]);

            String output = outContent.toString();
            assertTrue("Expected output not found. Expected to find: \"" + expectedOutput + "\"\nBut got:\n" + output,
                       output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testNoNumbers() {
        // Input: 0 immediately, no positive numbers entered
        testOutput("0\n", "Cannot calculate the average");
    }

    @Test
    public void testOnePositiveThenZero() {
        // Input: 1 then 0
        testOutput("1\n0\n", "1.0");
    }

    @Test(timeout = 1000)
    public void testMultiplePositives() {
        // Input: 1, 2, 0
        testOutput("1\n2\n0\n", "1.5");
    }

    @Test(timeout = 1000)
    public void testNegativeThenPositive() {
        // Input: -1, 3, 0
        testOutput("-1\n3\n0\n", "3.0");
    }

    @Test(timeout = 1000)
    public void testThreeOnes() {
        // Input: 1, 1, 1, 0
        testOutput("1\n1\n1\n0\n", "1.0");
    }

    @Test(timeout = 1000)
    public void testOnlyNegativesThenZero() {
        // Input: -3, -5, 0
        testOutput("-3\n-5\n0\n", "Cannot calculate the average");
    }

    @Test(timeout = 1000)
    public void testMixedWithZeroAverage() {
        // Input: -3, -2, 0
        testOutput("-3\n-2\n0\n", "Cannot calculate the average");
    }
}
