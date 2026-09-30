package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P30_CountingTest {

    private void testOutput(String input, String expectedExact, String expectedRegex, String... unexpectedOutputs) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P30_Counting.main(new String[0]);

            String output = outContent.toString();

            String actual = sanitize(output.trim());
            String expected = sanitize(expectedExact.trim());

            assertEquals("Full output mismatch.\nExpected:\n" + expected + "\nBut got:\n" + actual, expected, actual);
            assertTrue("Expected output pattern not matched.\nExpected to match regex:\n" + expectedRegex + "\nBut got:\n" + actual,
                    actual.matches(expectedRegex));

            for (String unexpected : unexpectedOutputs) {
                assertFalse("Unexpected output found: \"" + unexpected + "\"", actual.contains(unexpected));
            }

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    private String sanitize(String s) {
        return s.replace("\r\n", "\n").replace("\r", "\n");
    }

    @Test(timeout = 1000)
    public void testCountingToOne() {
        testOutput(
                "1\n",
                "0\n1",
                "\\s*0\\s*1\\s*",
                "-1", "2"
        );
    }

    @Test(timeout = 1000)
    public void testCountingToFive() {
        testOutput(
                "5\n",
                "0\n1\n2\n3\n4\n5",
                "\\s*0\\s*1\\s*2\\s*3\\s*4\\s*5\\s*",
                "-1", "6"
        );
    }

    @Test(timeout = 1000)
    public void testCountingToZero() {
        testOutput(
                "0\n",
                "0",
                "\\s*0\\s*",
                "1", "-1"
        );
    }

    @Test(timeout = 1000)
    public void testNegativeNumber() {
        testOutput(
                "-3\n",
                "",
                "",
                "0", "1", "-2"
        );
    }
}
