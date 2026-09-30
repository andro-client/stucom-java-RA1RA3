package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P26_SumOfNumbersTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P26_SumOfNumbers.main(new String[0]);

            String output = outContent.toString();
            assertTrue("Expected output not found. Output was:\n" + output,
                    output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testNoNumbers() {
        testOutput("0\n", "Sum of the numbers: 0");
    }

    @Test(timeout = 1000)
    public void testPositiveNumbers() {
        testOutput("3\n4\n5\n0\n", "Sum of the numbers: 12");
    }

    @Test(timeout = 1000)
    public void testNegativeNumbers() {
        testOutput("-2\n-3\n-5\n0\n", "Sum of the numbers: -10");
    }

    @Test(timeout = 1000)
    public void testMixedNumbers() {
        testOutput("10\n-5\n3\n0\n", "Sum of the numbers: 8");
    }
}
