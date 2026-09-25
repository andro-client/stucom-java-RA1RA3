package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P42_NumberReaderReverseTest {

    @Test(timeout = 1000)
    public void testInputOutputReverseOrder() {
        String input = "1\n2\n3\n4\n5\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P42_NumberReaderReverse.main(new String[0]);

            String output = outContent.toString();

            int promptCount = output.split("Enter a number: ").length - 1;
            assertEquals(5, promptCount);

            assertTrue(output.contains("The numbers (in reverse order):"));

            String[] lines = output.split("\\r?\\n");
            for (int i = 0; i < 5; i++) {
                assertEquals(String.valueOf(5 - i), lines[lines.length - 5 + i].trim());
            }

        } finally {
            System.setOut(originalOut);
            System.setIn(System.in);
        }
    }
}
