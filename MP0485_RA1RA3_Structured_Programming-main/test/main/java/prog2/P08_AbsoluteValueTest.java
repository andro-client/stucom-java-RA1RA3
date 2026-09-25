package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P08_AbsoluteValueTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P08_AbsoluteValue.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testPositiveNumber() {
        String output = runWithInput("5\n");
        assertEquals("5", output);
    }

    @Test
    public void testZero() {
        String output = runWithInput("0\n");
        assertEquals("0", output);
    }

    @Test
    public void testNegativeNumber() {
        String output = runWithInput("-7\n");
        assertEquals("7", output);
    }

    @Test
    public void testNegativeOne() {
        String output = runWithInput("-1\n");
        assertEquals("1", output);
    }
}
