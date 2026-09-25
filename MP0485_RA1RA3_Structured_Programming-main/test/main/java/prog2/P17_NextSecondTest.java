package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P17_NextSecondTest {

    private String runMainWithInput(String input) throws IOException {
        InputStream sysInBackup = System.in;
        PrintStream sysOutBackup = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printOut = new PrintStream(out);

        System.setIn(in);
        System.setOut(printOut);

        P17_NextSecond.main(new String[0]);

        System.setIn(sysInBackup);
        System.setOut(sysOutBackup);

        return out.toString().trim();
    }

    @Test
    public void testSimpleIncrement() throws IOException {
        String output = runMainWithInput("12\n30\n15\n");
        assertTrue("Expected '12:30:16' in output but got:\n" + output,
                output.contains("12:30:16"));
    }

    @Test
    public void testSecondOverflow() throws IOException {
        String output = runMainWithInput("14\n59\n59\n");
        assertTrue("Expected '15:0:0' in output but got:\n" + output,
                output.contains("15:0:0"));
    }

    @Test
    public void testMinuteOverflow() throws IOException {
        String output = runMainWithInput("10\n59\n59\n");
        assertTrue("Expected '11:0:0' in output but got:\n" + output,
                output.contains("11:0:0"));
    }

    @Test
    public void testHourOverflow() throws IOException {
        String output = runMainWithInput("23\n59\n59\n");
        assertTrue("Expected '0:0:0' in output but got:\n" + output,
                output.contains("0:0:0"));
    }

    @Test
    public void testAlmostMidnight() throws IOException {
        String output = runMainWithInput("23\n59\n58\n");
        assertTrue("Expected '23:59:59' in output but got:\n" + output,
                output.contains("23:59:59"));
    }
}
