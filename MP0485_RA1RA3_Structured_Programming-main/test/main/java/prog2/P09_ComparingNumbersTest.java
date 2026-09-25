package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P09_ComparingNumbersTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P09_ComparingNumbers.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testFirstGreater() {
        String output = runWithInput("10\n5\n");
        assertEquals("10 is greater than 5.", output);
    }

    @Test
    public void testFirstSmaller() {
        String output = runWithInput("3\n7\n");
        assertEquals("3 is smaller than 7.", output);
    }

    @Test
    public void testEqual() {
        String output = runWithInput("8\n8\n");
        assertEquals("8 is equal to 8.", output);
    }
}
