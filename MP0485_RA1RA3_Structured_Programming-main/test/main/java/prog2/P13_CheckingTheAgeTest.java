package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P13_CheckingTheAgeTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P13_CheckingTheAge.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testValidAgeLowerBound() {
        String input = "0\n";
        String expected = "How old are you? OK";
        String output = runWithInput(input);
        assertEquals("Age 0 should be valid", expected, output);
    }

    @Test
    public void testValidAgeUpperBound() {
        String input = "120\n";
        String expected = "How old are you? OK";
        String output = runWithInput(input);
        assertEquals("Age 120 should be valid", expected, output);
    }

    @Test
    public void testInvalidNegativeAge() {
        String input = "-1\n";
        String expected = "How old are you? Impossible!";
        String output = runWithInput(input);
        assertEquals("Negative age should be invalid", expected, output);
    }

    @Test
    public void testInvalidOverUpperBound() {
        String input = "121\n";
        String expected = "How old are you? Impossible!";
        String output = runWithInput(input);
        assertEquals("Age over 120 should be invalid", expected, output);
    }
}
