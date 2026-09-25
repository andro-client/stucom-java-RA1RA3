package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P41_NumberReaderTest {

    @Test(timeout = 1000)
    public void testInputOutputOrder() {
        String input = "10\n20\n30\n40\n50\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P41_NumberReader.main(new String[0]);

            String output = outContent.toString();

            int promptCount = output.split("Enter a number: ").length - 1;
            assertEquals(5, promptCount);

            assertTrue(output.contains("The numbers are:"));
            assertTrue(output.contains("10"));
            assertTrue(output.contains("20"));
            assertTrue(output.contains("30"));
            assertTrue(output.contains("40"));
            assertTrue(output.contains("50"));

            String[] lines = output.split("\\r?\\n");
            for (int i = 0; i < 5; i++) {
                assertEquals(String.valueOf(10 + 10 * i), lines[lines.length - 5 + i].trim());
            }

        } finally {
            System.setOut(originalOut);
            System.setIn(System.in);
        }
    }
}
