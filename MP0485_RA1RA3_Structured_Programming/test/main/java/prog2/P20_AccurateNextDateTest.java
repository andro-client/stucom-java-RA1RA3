package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P20_AccurateNextDateTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P20_AccurateNextDate.main(new String[0]);

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
    public void testEndOfShortMonth() {
        testOutput("30\n4\n2023\n", "1/5/2023");
    }

    @Test
    public void testEndOfLongMonth() {
        testOutput("31\n1\n2023\n", "1/2/2023");
    }

    @Test
    public void testEndOfFebruaryLeapYear() {
        testOutput("29\n2\n2024\n", "1/3/2024");
    }

    @Test
    public void testEndOfFebruaryNonLeapYear() {
        testOutput("28\n2\n2023\n", "1/3/2023");
    }

    @Test
    public void testEndOfYear() {
        testOutput("31\n12\n2023\n", "1/1/2024");
    }

    @Test
    public void testNegativeYearCorrection() {
        testOutput("31\n12\n-1\n", "1/1/1");
    }
}
