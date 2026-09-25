package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P18_NumberToWordTest {

    private void testOutput(int input, String expectedOutput) {
        String inputData = input + "\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(inputData.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P18_NumberToWord.main(new String[0]);

            String output = outContent.toString().trim();
            assertTrue("Expected output not found in: " + output,
                    output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testValidInputs() {
        testOutput(0, "ZERO");
        testOutput(1, "ONE");
        testOutput(2, "TWO");
        testOutput(3, "THREE");
        testOutput(4, "FOUR");
        testOutput(5, "FIVE");
        testOutput(6, "SIX");
        testOutput(7, "SEVEN");
        testOutput(8, "EIGHT");
        testOutput(9, "NINE");
        testOutput(10, "TEN");
    }

    @Test
    public void testInvalidInputNegative() {
        testOutput(-1, "Invalid grade.");
    }

    @Test
    public void testInvalidInputOverTen() {
        testOutput(11, "Invalid grade.");
        testOutput(99, "Invalid grade.");
    }
}
