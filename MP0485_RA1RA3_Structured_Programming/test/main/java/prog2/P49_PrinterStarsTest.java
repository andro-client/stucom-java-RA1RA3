package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P49_PrinterStarsTest {

    private String sanitize(String s) {
        return s.replace("\r\n", "\n").replace("\r", "");
    }

    @Test(timeout = 1000)
    public void testTypicalArray() {
        int[] input = {3, 1, 2};
        String expected = "***\n*\n**";

        String result = sanitize(capturePrintArrayInStarsOutput(input));
        assertEquals("Stars for {3, 1, 2} should be printed as expected", expected, result);
    }

    @Test(timeout = 1000)
    public void testAllZeros() {
        int[] input = {0, 0, 0};
        String expected = "";

        String result = sanitize(capturePrintArrayInStarsOutput(input));
        assertEquals("For array {0, 0, 0}, expected three empty lines", expected, result);
    }

    @Test(timeout = 1000)
    public void testSingleValue() {
        int[] input = {5};
        String expected = "*****";

        String result = sanitize(capturePrintArrayInStarsOutput(input));
        assertEquals("Stars for single value {5} should be '*****'", expected, result);
    }

    @Test(timeout = 1000)
    public void testEmptyArray() {
        int[] input = {};
        String expected = "";

        String result = sanitize(capturePrintArrayInStarsOutput(input));
        assertEquals("Empty array should produce no output", expected, result);
    }

    @Test(timeout = 1000)
    public void testMixedValues() {
        int[] input = {1, 4, 0, 2};
        String expected = "*\n****\n\n**";

        String result = sanitize(capturePrintArrayInStarsOutput(input));
        assertEquals("Stars for {1, 4, 0, 2} should match", expected, result);
    }

    private String capturePrintArrayInStarsOutput(int[] input) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        P49_PrinterStars.printArrayInStars(input);

        System.setOut(originalOut);
        return outContent.toString().trim();
    }
}
