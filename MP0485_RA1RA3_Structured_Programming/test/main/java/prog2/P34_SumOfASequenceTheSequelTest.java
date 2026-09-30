package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P34_SumOfASequenceTheSequelTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P34_SumOfASequenceTheSequel.main(new String[0]);

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
    public void testFrom3To5() {
        testOutput("3\n5\n", "The sum is 12");
    }

    @Test(timeout = 1000)
    public void testFrom1To10() {
        testOutput("1\n10\n", "The sum is 55");
    }

    @Test(timeout = 1000)
    public void testFrom0To0() {
        testOutput("0\n0\n", "The sum is 0");
    }

    @Test(timeout = 1000)
    public void testFromNegativeToPositive() {
        testOutput("-3\n3\n", "The sum is 0");
    }

    @Test(timeout = 1000)
    public void testFrom10To10() {
        testOutput("10\n10\n", "The sum is 10");
    }
}
