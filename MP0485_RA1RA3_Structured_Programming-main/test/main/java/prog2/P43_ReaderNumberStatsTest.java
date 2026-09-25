package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class P43_ReaderNumberStatsTest {

    @Test(timeout = 1000)
    public void testPosNegZeroStats() {
        String input = "5\n-3\n0\n7\n0\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            P43_ReaderNumberStats.main(new String[0]);

            String output = outContent.toString();

            int promptCount = output.split("Enter a number: ").length - 1;
            assertEquals(5, promptCount);

            assertTrue(output.contains("Average of positive numbers:"));
            assertTrue(output.contains("Average of negative numbers:"));
            assertTrue(output.contains("Count of zeros:"));

            assertTrue(output.contains("6.0"));  // average positive (5+7)/2
            assertTrue(output.contains("-3.0")); // average negative (-3)/1
            assertTrue(output.contains("2"));    // count zeros

        } finally {
            System.setOut(originalOut);
            System.setIn(System.in);
        }
    }
}
