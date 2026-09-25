package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P48_ArrayPrinterTest {

    @Test(timeout = 1000)
    public void testPrintNeatlyThreeElements() {
        int[] input = {1, 2, 3};
        String expected = "1, 2, 3";

        String result = capturePrintNeatlyOutput(input);
        assertEquals("Output for {1, 2, 3} should be exactly '1, 2, 3'", expected, result);
    }

    @Test(timeout = 1000)
    public void testPrintNeatlySingleElement() {
        int[] input = {7};
        String expected = "7";

        String result = capturePrintNeatlyOutput(input);
        assertEquals("Output for {7} should be exactly '7'", expected, result);
    }

    @Test(timeout = 1000)
    public void testPrintNeatlyEmptyArray() {
        int[] input = {};
        String expected = "";

        String result = capturePrintNeatlyOutput(input);
        assertEquals("Output for empty array should be empty string", expected, result);
    }

    @Test(timeout = 1000)
    public void testPrintNeatlyMultipleElements() {
        int[] input = {5, 1, 3, 4, 2};
        String expected = "5, 1, 3, 4, 2";

        String result = capturePrintNeatlyOutput(input);
        assertEquals("Output for {5, 1, 3, 4, 2} should be exactly '5, 1, 3, 4, 2'", expected, result);
    }

    private String capturePrintNeatlyOutput(int[] input) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        P48_ArrayPrinter.printNeatly(input);

        System.setOut(originalOut);
        return outContent.toString().trim();
    }
}
