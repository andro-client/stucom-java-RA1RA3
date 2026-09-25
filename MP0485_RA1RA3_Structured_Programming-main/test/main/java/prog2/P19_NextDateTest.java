package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P19_NextDateTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P19_NextDate.main(new String[0]);

            String output = outContent.toString().trim();
            assertTrue("Expected output not found.\nExpected: \"" + expectedOutput + "\"\nActual: \"" + output + "\"",
                       output.contains(expectedOutput));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testRegularDate() {
        testOutput("5\n6\n2023\n", "6/6/2023");
    }

    @Test
    public void testEndOfMonth() {
        testOutput("30\n4\n2023\n", "1/5/2023");
    }

    @Test
    public void testEndOfYear() {
        testOutput("30\n12\n2023\n", "1/1/2024");
    }   

    @Test
    public void testMiddleOfMonth() {
        testOutput("15\n8\n2022\n", "16/8/2022");
    }
}
