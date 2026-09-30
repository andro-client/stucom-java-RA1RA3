package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class P05_AdulthoodTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the program
        P05_Adulthood.main(new String[0]);

        // Restore original input/output
        System.setOut(originalOut);
        System.setIn(originalIn);

        return out.toString().replace("\r\n", "\n").trim(); // Normalize line breaks
    }

    @Test
    public void testAge17() {
        String output = runWithInput("17\n");
        assertEquals("How old are you?\nYou are not an adult", output);
    }

    @Test
    public void testAge18() {
        String output = runWithInput("18\n");
        assertEquals("How old are you?\nYou are an adult", output);
    }

    @Test
    public void testAge0() {
        String output = runWithInput("0\n");
        assertEquals("How old are you?\nYou are not an adult", output);
    }

    @Test
    public void testAge99() {
        String output = runWithInput("99\n");
        assertEquals("How old are you?\nYou are an adult", output);
    }
}
