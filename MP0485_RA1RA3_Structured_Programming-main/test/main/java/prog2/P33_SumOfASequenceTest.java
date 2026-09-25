package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P33_SumOfASequenceTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P33_SumOfASequence.main(new String[0]);

            String output = outContent.toString().replace("\r\n", "\n").trim();
            expectedOutput = expectedOutput.replace("\r\n", "\n").trim();

            assertTrue("Expected output to contain:\n" + expectedOutput + "\nbut was:\n" + output,
                       output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testSumUpToFive() {
        testOutput("5\n", "The sum is 15");
    }

    @Test(timeout = 1000)
    public void testSumUpToTen() {
        testOutput("10\n", "The sum is 55");
    }

    @Test(timeout = 1000)
    public void testSumUpToZero() {
        testOutput("0\n", "The sum is 0");
    }

    @Test(timeout = 1000)
    public void testSumUpToOne() {
        testOutput("1\n", "The sum is 1");
    }

    @Test(timeout = 1000)
    public void testSumUpTo100() {
        testOutput("100\n", "The sum is 5050");
    }
}
