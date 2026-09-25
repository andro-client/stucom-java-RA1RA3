package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P21_CarryOnTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P21_CarryOn.main(new String[0]);

            return outContent.toString().replace("\r\n", "\n").trim();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testCarryOn() {
        // Test case 1: Single "no" input - loop runs once and exits
        String input1 = "no\n";
        String output1 = runWithInput(input1);
        String expectedOutput1 = "Shall we carry on?";
        assertEquals("Test case 1 (input 'no'): Expected '" + expectedOutput1 + "', but got '" + output1 + "'", 
                expectedOutput1, output1);

        // Test case 2: "yes" then "no" - loop runs twice
        String input2 = "yes\nno\n";
        String output2 = runWithInput(input2);
        String expectedOutput2 = "Shall we carry on?\nShall we carry on?";
        assertEquals("Test case 2 (input 'yes\\nno'): Expected '" + expectedOutput2 + "', but got '" + output2 + "'", 
                expectedOutput2, output2);

        // Test case 3: Multiple iterations ("go", "maybe", "yep", then "no")
        String input3 = "go\nmaybe\nyep\nno\n";
        String output3 = runWithInput(input3);
        String expectedOutput3 = "Shall we carry on?\nShall we carry on?\nShall we carry on?\nShall we carry on?";
        assertEquals("Test case 3 (input 'go\\nmaybe\\nyep\\nno'): Expected 4 prompts, but got '" + output3 + "'", 
                expectedOutput3, output3);

        // Test case 4: Continue with empty line then "no"
        String input4 = "\nno\n";
        String output4 = runWithInput(input4);
        String expectedOutput4 = "Shall we carry on?\nShall we carry on?";
        assertEquals("Test case 4 (input '\\nno'): Expected '" + expectedOutput4 + "', but got '" + output4 + "'", 
                expectedOutput4, output4);

        // Verify prompt count for all cases
        int promptCount1 = countOccurrences(output1, "Shall we carry on?");
        assertEquals("Test case 1: Expected 1 prompt, but got " + promptCount1, 1, promptCount1);

        int promptCount2 = countOccurrences(output2, "Shall we carry on?");
        assertEquals("Test case 2: Expected 2 prompts, but got " + promptCount2, 2, promptCount2);

        int promptCount3 = countOccurrences(output3, "Shall we carry on?");
        assertEquals("Test case 3: Expected 4 prompts, but got " + promptCount3, 4, promptCount3);

        int promptCount4 = countOccurrences(output4, "Shall we carry on?");
        assertEquals("Test case 4: Expected 2 prompts, but got " + promptCount4, 2, promptCount4);
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
