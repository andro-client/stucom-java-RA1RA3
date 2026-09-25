package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P22_AreWeThereYetTest {

    private void testPromptCount(String input, int expectedPromptCount) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P22_AreWeThereYet.main(new String[0]);

            String output = outContent.toString();
            long promptCount = output.lines()
                                     .filter(line -> line.trim().equals("Give a number:"))
                                     .count();

            assertEquals("Expected prompt count does not match.", expectedPromptCount, promptCount);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testStopsImmediately() {
        testPromptCount("4\n", 1);
    }

    @Test(timeout = 1000)
    public void testThreeIterations() {
        testPromptCount("1\n3\n4\n", 3);
    }

    @Test(timeout = 1000)
    public void testFiveIterations() {
        testPromptCount("9\n2\n7\n0\n4\n", 5);
    }
}
