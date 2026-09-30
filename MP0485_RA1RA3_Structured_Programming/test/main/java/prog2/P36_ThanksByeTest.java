package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P36_ThanksByeTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P36_ThanksBye.main(new String[0]);

            return outContent.toString().replace("\r\n", "\n");
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    private String extractValue(String output, String prefix) {
        String[] lines = output.split("\n");
        for (String line : lines) {
            if (line.startsWith(prefix)) {
                return line.substring(prefix.length()).trim();
            }
        }
        return "";
    }

    @Test(timeout = 1000)
    public void testProgram() {
        // Test case 1: Mixed numbers (even and odd)
        String output1 = runWithInput("2\n3\n4\n5\n-1\n");
        String expected1 = "Give numbers:\nThx! Bye!\nSum: 14\nNumbers: 4\nAverage: 3.5\nEven: 2\nOdd: 2\n";
        assertEquals("Test case 1 (mixed): Expected output doesn't match", expected1, output1);
        assertEquals("Test case 1 (mixed): Sum incorrect", "14", extractValue(output1, "Sum: "));
        assertEquals("Test case 1 (mixed): Numbers count incorrect", "4", extractValue(output1, "Numbers: "));
        assertEquals("Test case 1 (mixed): Average incorrect", "3.5", extractValue(output1, "Average: "));
        assertEquals("Test case 1 (mixed): Even count incorrect", "2", extractValue(output1, "Even: "));
        assertEquals("Test case 1 (mixed): Odd count incorrect", "2", extractValue(output1, "Odd: "));

        // Test case 2: All even numbers
        String output2 = runWithInput("2\n4\n6\n-1\n");
        String expected2 = "Give numbers:\nThx! Bye!\nSum: 12\nNumbers: 3\nAverage: 4.0\nEven: 3\nOdd: 0\n";
        assertEquals("Test case 2 (all even): Expected output doesn't match", expected2, output2);
        assertEquals("Test case 2 (all even): Average incorrect", "4.0", extractValue(output2, "Average: "));

        // Test case 3: All odd numbers
        String output3 = runWithInput("1\n3\n5\n-1\n");
        String expected3 = "Give numbers:\nThx! Bye!\nSum: 9\nNumbers: 3\nAverage: 3.0\nEven: 0\nOdd: 3\n";
        assertEquals("Test case 3 (all odd): Expected output doesn't match", expected3, output3);

        // Test case 4: No numbers (only -1)
        String output4 = runWithInput("-1\n");
        String expected4 = "Give numbers:\nThx! Bye!\nSum: 0\nNumbers: 0\nAverage: NaN\nEven: 0\nOdd: 0\n";
        assertEquals("Test case 4 (no numbers): Expected output doesn't match", expected4, output4);

        // Test case 5: Single number (odd)
        String output5 = runWithInput("7\n-1\n");
        String expected5 = "Give numbers:\nThx! Bye!\nSum: 7\nNumbers: 1\nAverage: 7.0\nEven: 0\nOdd: 1\n";
        assertEquals("Test case 5 (single odd): Expected output doesn't match", expected5, output5);

        // Test case 6: Single number (even)
        String output6 = runWithInput("10\n-1\n");
        String expected6 = "Give numbers:\nThx! Bye!\nSum: 10\nNumbers: 1\nAverage: 10.0\nEven: 1\nOdd: 0\n";
        assertEquals("Test case 6 (single even): Expected output doesn't match", expected6, output6);

        // Test case 7: Negative numbers included
        String output7 = runWithInput("-2\n-3\n4\n-1\n");
        String expected7 = "Give numbers:\nThx! Bye!\nSum: -1\nNumbers: 3\nAverage: -0.3333333333333333\nEven: 2\nOdd: 1\n";
        assertEquals("Test case 7 (with negatives): Expected output doesn't match", expected7, output7);
    }
}
