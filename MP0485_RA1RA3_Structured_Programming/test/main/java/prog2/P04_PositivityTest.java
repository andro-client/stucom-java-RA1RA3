package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P04_PositivityTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P04_Positivity.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testPositiveNumber() {
        String output = runWithInput("5\n");
        assertTrue("Expected output to contain 'The number is positive.'", 
                   output.contains("The number is positive."));
    }

    @Test
    public void testZeroIsNotPositive() {
        String output = runWithInput("0\n");
        assertTrue("Expected output to contain 'The number is not positive.'", 
                   output.contains("The number is not positive."));
    }

    @Test
    public void testNegativeNumber() {
        String output = runWithInput("-8\n");
        assertTrue("Expected output to contain 'The number is not positive.'", 
                   output.contains("The number is not positive."));
    }

    @Test
    public void testLargePositive() {
        String output = runWithInput("999\n");
        assertTrue("Expected output to contain 'The number is positive.'", 
                   output.contains("The number is positive."));
    }
}
