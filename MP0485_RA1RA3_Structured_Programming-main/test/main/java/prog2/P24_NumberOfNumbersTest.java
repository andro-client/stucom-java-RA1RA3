package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P24_NumberOfNumbersTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P24_NumberOfNumbers.main(new String[0]);

            return outContent.toString().replace("\r\n", "\n").trim();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testNumberOfNumbers() {
        // Test case 1: No numbers (input 0 immediately)
        String input1 = "0\n";
        String output1 = runWithInput(input1);
        String expectedOutput1 = "Give a number:\nNumber of numbers: 0";
        assertEquals("Test case 1 (input '0'): Expected '" + expectedOutput1 + "', but got '" + output1 + "'", 
                expectedOutput1, output1);

        // Test case 2: One number then 0
        String input2 = "5\n0\n";
        String output2 = runWithInput(input2);
        String expectedOutput2 = "Give a number:\nGive a number:\nNumber of numbers: 1";
        assertEquals("Test case 2 (input '5\\n0'): Expected '" + expectedOutput2 + "', but got '" + output2 + "'", 
                expectedOutput2, output2);

        // Test case 3: Multiple numbers then 0
        String input3 = "3\n7\n10\n0\n";
        String output3 = runWithInput(input3);
        String expectedOutput3 = "Give a number:\nGive a number:\nGive a number:\nGive a number:\nNumber of numbers: 3";
        assertEquals("Test case 3 (input '3\\n7\\n10\\n0'): Expected '" + expectedOutput3 + "', but got '" + output3 + "'", 
                expectedOutput3, output3);

        // Test case 4: Negative numbers then 0
        String input4 = "-1\n-5\n0\n";
        String output4 = runWithInput(input4);
        String expectedOutput4 = "Give a number:\nGive a number:\nGive a number:\nNumber of numbers: 2";
        assertEquals("Test case 4 (input '-1\\n-5\\n0'): Expected '" + expectedOutput4 + "', but got '" + output4 + "'", 
                expectedOutput4, output4);

        // Test case 5: Single large number then 0
        String input5 = "999\n0\n";
        String output5 = runWithInput(input5);
        String expectedOutput5 = "Give a number:\nGive a number:\nNumber of numbers: 1";
        assertEquals("Test case 5 (input '999\\n0'): Expected '" + expectedOutput5 + "', but got '" + output5 + "'", 
                expectedOutput5, output5);

        // Verify prompt count for each case
        int promptCount1 = countOccurrences(output1, "Give a number:");
        assertEquals("Test case 1: Expected 1 prompt, but got " + promptCount1, 1, promptCount1);

        int promptCount2 = countOccurrences(output2, "Give a number:");
        assertEquals("Test case 2: Expected 2 prompts, but got " + promptCount2, 2, promptCount2);

        int promptCount3 = countOccurrences(output3, "Give a number:");
        assertEquals("Test case 3: Expected 4 prompts, but got " + promptCount3, 4, promptCount3);

        int promptCount4 = countOccurrences(output4, "Give a number:");
        assertEquals("Test case 4: Expected 3 prompts, but got " + promptCount4, 3, promptCount4);

        int promptCount5 = countOccurrences(output5, "Give a number:");
        assertEquals("Test case 5: Expected 2 prompts, but got " + promptCount5, 2, promptCount5);

        // Verify final messages
        assertTrue("Test case 1: Final message should contain counter", output1.contains("Number of numbers: 0"));
        assertTrue("Test case 2: Final message should contain counter", output2.contains("Number of numbers: 1"));
        assertTrue("Test case 3: Final message should contain counter", output3.contains("Number of numbers: 3"));
        assertTrue("Test case 4: Final message should contain counter", output4.contains("Number of numbers: 2"));
        assertTrue("Test case 5: Final message should contain counter", output5.contains("Number of numbers: 1"));
    }

    private int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        return count;
    }
}
