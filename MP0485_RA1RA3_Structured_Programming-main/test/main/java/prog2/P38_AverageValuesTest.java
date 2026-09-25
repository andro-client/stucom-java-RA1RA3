package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P38_AverageValuesTest {

    private void runWithInputAndCheckOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));

            P38_AverageValues.main(new String[0]);

            String programOutput = output.toString();
            assertTrue("Expected output to contain: " + expectedOutput, programOutput.contains(expectedOutput));

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testStudent1Average() {
        String input = String.join(System.lineSeparator(),
            "5", "5", "5", "5",   // Student 1: average 5.00
            "0", "0", "0", "0",   // Student 2: irrelevant
            "0", "0", "0", "0"    // Student 3: irrelevant
        );
        runWithInputAndCheckOutput(input, "Student 1 average: 5,00");
    }

    @Test(timeout = 1000)
    public void testStudent2Average() {
        String input = String.join(System.lineSeparator(),
            "0", "0", "0", "0",   // Student 1: irrelevant
            "7", "7", "7", "7",   // Student 2: average 7.00
            "0", "0", "0", "0"    // Student 3: irrelevant
        );
        runWithInputAndCheckOutput(input, "Student 2 average: 7,00");
    }

    @Test(timeout = 1000)
    public void testStudent3Average() {
        String input = String.join(System.lineSeparator(),
            "0", "0", "0", "0",   // Student 1: irrelevant
            "0", "0", "0", "0",   // Student 2: irrelevant
            "9", "9", "9", "9"    // Student 3: average 9.00
        );
        runWithInputAndCheckOutput(input, "Student 3 average: 9,00");
    }

    @Test(timeout = 1000)
    public void testAllStudentsCorrect() {
        String input = String.join(System.lineSeparator(),
            "4", "4", "4", "4",   // Student 1: 4.00
            "5", "5", "5", "5",   // Student 2: 5.00
            "6", "6", "6", "6"    // Student 3: 6.00
        );
        runWithInputAndCheckOutput(input, "Student 1 average: 4,00");
        runWithInputAndCheckOutput(input, "Student 2 average: 5,00");
        runWithInputAndCheckOutput(input, "Student 3 average: 6,00");
    }
}
