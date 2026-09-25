package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P23_OnlyPositivesTest {

    private void testOutput(String input, String[] expectedOutputs) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P23_OnlyPositives.main(new String[0]);

            String output = outContent.toString();

            for (String expected : expectedOutputs) {
                assertTrue("Expected output not found: \"" + expected + "\"\nActual output:\n" + output,
                        output.contains(expected));
            }
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testPositiveNumbers() {
        String input = "3\n5\n0\n";
        String[] expected = {
            "Give a number:",
            "9",
            "Give a number:",
            "25",
            "Give a number:"
        };
        testOutput(input, expected);
    }

    @Test(timeout = 1000)
    public void testNegativeNumber() {
        String input = "-1\n0\n";
        String[] expected = {
            "Give a number:",
            "Unsuitable number",
            "Give a number:"
        };
        testOutput(input, expected);
    }

    @Test(timeout = 1000)
    public void testMixedInputs() {
        String input = "4\n-3\n2\n0\n";
        String[] expected = {
            "Give a number:",
            "16",
            "Give a number:",
            "Unsuitable number",
            "Give a number:",
            "4",
            "Give a number:"
        };
        testOutput(input, expected);
    }
}
