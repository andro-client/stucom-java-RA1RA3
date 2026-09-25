package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P46_IndexWasNotFoundTest {

    @Test(timeout = 1000)
    public void testValueFoundAtIndex2() {
        String input = "8\n";  // 8 is at index 2
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain '8 is at index 2.' but was:\n" + output,
                   output.contains("8 is at index 2."));
    }

    @Test(timeout = 1000)
    public void testValueNotFound() {
        String input = "99\n";  // 99 is not in the array
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain '99 was not found.' but was:\n" + output,
                   output.contains("99 was not found."));
    }

    @Test(timeout = 1000)
    public void testValueFoundAtIndex6() {
        String input = "9\n";  // 9 is at index 6
        String output = runProgramWithInput(input);
        assertTrue("Expected output to contain '9 is at index 6.' but was:\n" + output,
                   output.contains("9 is at index 6."));
    }

    // Helper method
    private String runProgramWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();

        System.setIn(testIn);
        System.setOut(new PrintStream(testOut));

        try {
            P46_IndexWasNotFound.main(new String[0]);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        return testOut.toString();
    }
}
