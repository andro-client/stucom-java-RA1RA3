package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P25_NumberOfNegativeNumbersTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P25_NumberOfNegativeNumbers.main(new String[0]);

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
        testOutput("0\n", "Number of negative numbers: 0");
    }

    @Test(timeout = 1000)
    public void testNoNegatives() {
        testOutput("5\n3\n1\n0\n", "Number of negative numbers: 0");
    }

    @Test(timeout = 1000)
    public void testSomeNegatives() {
        testOutput("-1\n3\n-5\n0\n", "Number of negative numbers: 2");
    }

    @Test(timeout = 1000)
    public void testAllNegatives() {
        testOutput("-3\n-7\n-10\n0\n", "Number of negative numbers: 3");
    }
}
