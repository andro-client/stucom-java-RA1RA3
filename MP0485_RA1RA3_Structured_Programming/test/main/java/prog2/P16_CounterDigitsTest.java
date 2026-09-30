package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P16_CounterDigitsTest {

    private String runMainWithInput(String input) throws IOException {
        InputStream sysInBackup = System.in; // backup System.in
        PrintStream sysOutBackup = System.out; // backup System.out

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printOut = new PrintStream(out);

        System.setIn(in);
        System.setOut(printOut);

        // Run main method
        P16_CounterDigits.main(new String[0]);

        System.setIn(sysInBackup);
        System.setOut(sysOutBackup);

        return out.toString();
    }

    @Test
    public void testOneDigit() throws IOException {
        String output = runMainWithInput("5\n");
        assertTrue("Expected '1 digit' in output but got:\n" + output,
            output.contains("1 digit"));
    }

    @Test
    public void testTwoDigits() throws IOException {
        String output = runMainWithInput("42\n");
        assertTrue("Expected '2 digits' in output but got:\n" + output,
            output.contains("2 digits"));
    }

    @Test
    public void testThreeDigits() throws IOException {
        String output = runMainWithInput("999\n");
        assertTrue("Expected '3 digits' in output but got:\n" + output,
            output.contains("3 digits"));
    }

    @Test
    public void testFourDigits() throws IOException {
        String output = runMainWithInput("1234\n");
        assertTrue("Expected '4 digits' in output but got:\n" + output,
            output.contains("4 digits"));
    }

    @Test
    public void testFiveDigits() throws IOException {
        String output = runMainWithInput("99999\n");
        assertTrue("Expected '5 digits' in output but got:\n" + output,
            output.contains("5 digits"));
    }

    @Test
    public void testNumberOutOfRangeNegative() throws IOException {
        String output = runMainWithInput("-1\n");
        assertTrue("Expected 'Number out of range' in output but got:\n" + output,
            output.contains("Number out of range"));
    }

    @Test
    public void testNumberOutOfRangeTooBig() throws IOException {
        String output = runMainWithInput("100000\n");
        assertTrue("Expected 'Number out of range' in output but got:\n" + output,
            output.contains("Number out of range"));
    }
}
