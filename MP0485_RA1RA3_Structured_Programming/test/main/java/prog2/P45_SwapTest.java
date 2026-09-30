package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P45_SwapTest {

    @Test
    public void testSwapIndices() {
        // Simulate user input: swap index 1 and 3
        String input = "1\n3\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        // Capture system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P45_Swap.main(new String[0]);
            String output = outContent.toString().replaceAll("\\r", "");

            // Expected outputs
            String expectedOriginal = "1,3,5,7,9,\n";
            String expectedSwapped = "1,7,5,3,9,\n";

            // Extract output lines
            String[] lines = output.split("\n");

            // Find the two non-empty lines with commas
            String originalLine = null;
            String swappedLine = null;
            int count = 0;
            for (String line : lines) {
                if (line.contains(",")) {
                    if (count == 0) originalLine = line + "\n";
                    else if (count == 1) {
                        swappedLine = line + "\n";
                        break;
                    }
                    count++;
                }
            }

            assertEquals("Original array output does not match:", expectedOriginal, originalLine);
            assertEquals("Swapped array output does not match:", expectedSwapped, swappedLine);

        } finally {
            // Reset System.in and System.out
            System.setOut(originalOut);
            System.setIn(System.in);
        }
    }
}
