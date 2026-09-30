package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P02_OrwellTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P02_Orwell.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testPrintOrwellFor1984() {
        String output = runWithInput("1984\n");
        assertTrue("Expected output to contain 'Orwell'", output.contains("Orwell"));
    }

    @Test
    public void testNoOutputForOtherYear() {
        String output = runWithInput("2000\n");
        assertFalse("Output should not contain 'Orwell'", output.contains("Orwell"));
    }

    @Test
    public void testNoOutputForYearBefore1984() {
        String output = runWithInput("1900\n");
        assertFalse("Output should not contain 'Orwell'", output.contains("Orwell"));
    }

    @Test
    public void testPrintOrwellForYearExactly1984() {
        String output = runWithInput("1984\n");
        assertTrue("Expected output to contain 'Orwell'", output.contains("Orwell"));
    }
}
