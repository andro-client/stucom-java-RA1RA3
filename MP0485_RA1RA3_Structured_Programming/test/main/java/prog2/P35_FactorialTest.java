package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class P35_FactorialTest {

    private String runWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P35_Factorial.main(new String[0]);

            return outContent.toString().replace("\r\n", "\n");
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testFactorial() {
        // Test case 1: Factorial of 0 (0! = 1)
        String input1 = "0\n";
        String output1 = runWithInput(input1);
        String expectedOutput1 = "Give a number: Factorial: 1";
        // Normalize: remove extra whitespace but keep structure
        String normalizedOutput1 = output1.replace("\n", "").trim();
        assertTrue("Test case 1 (factorial of 0): Expected '" + expectedOutput1 + "', but got '" + normalizedOutput1 + "'", 
                output1.contains("Give a number:") && output1.contains("Factorial: 1"));

        // Test case 2: Factorial of 1 (1! = 1)
        String input2 = "1\n";
        String output2 = runWithInput(input2);
        assertTrue("Test case 2 (factorial of 1): Output should contain 'Give a number:' and 'Factorial: 1'", 
                output2.contains("Give a number:") && output2.contains("Factorial: 1"));

        // Test case 3: Factorial of 3 (3! = 6)
        String input3 = "3\n";
        String output3 = runWithInput(input3);
        assertTrue("Test case 3 (factorial of 3): Expected 'Factorial: 6', but got '" + output3 + "'", 
                output3.contains("Give a number:") && output3.contains("Factorial: 6"));
        assertFalse("Test case 3: Output should not contain 'Factorial: 5'", output3.contains("Factorial: 5"));

        // Test case 4: Factorial of 5 (5! = 120)
        String input4 = "5\n";
        String output4 = runWithInput(input4);
        assertTrue("Test case 4 (factorial of 5): Expected 'Factorial: 120', but got '" + output4 + "'", 
                output4.contains("Give a number:") && output4.contains("Factorial: 120"));

        // Test case 5: Factorial of 7 (7! = 5040)
        String input5 = "7\n";
        String output5 = runWithInput(input5);
        assertTrue("Test case 5 (factorial of 7): Expected 'Factorial: 5040', but got '" + output5 + "'", 
                output5.contains("Give a number:") && output5.contains("Factorial: 5040"));

        // Test case 6: Factorial of 10 (10! = 3628800)
        String input6 = "10\n";
        String output6 = runWithInput(input6);
        assertTrue("Test case 6 (factorial of 10): Expected 'Factorial: 3628800', but got '" + output6 + "'", 
                output6.contains("Give a number:") && output6.contains("Factorial: 3628800"));

        // Verify exact structure: prompt present
        assertTrue("All outputs should contain the prompt 'Give a number:'", 
                output1.contains("Give a number:") && 
                output2.contains("Give a number:") && 
                output3.contains("Give a number:") && 
                output4.contains("Give a number:") && 
                output5.contains("Give a number:") && 
                output6.contains("Give a number:"));

        // Verify exact structure: result present
        assertTrue("All outputs should contain 'Factorial:'", 
                output1.contains("Factorial:") && 
                output2.contains("Factorial:") && 
                output3.contains("Factorial:") && 
                output4.contains("Factorial:") && 
                output5.contains("Factorial:") && 
                output6.contains("Factorial:"));

        // Verify correct calculations for all cases
        assertEquals("Test case 1: 0! should be 1", "1", extractFactorialValue(output1));
        assertEquals("Test case 2: 1! should be 1", "1", extractFactorialValue(output2));
        assertEquals("Test case 3: 3! should be 6", "6", extractFactorialValue(output3));
        assertEquals("Test case 4: 5! should be 120", "120", extractFactorialValue(output4));
        assertEquals("Test case 5: 7! should be 5040", "5040", extractFactorialValue(output5));
        assertEquals("Test case 6: 10! should be 3628800", "3628800", extractFactorialValue(output6));
    }

    private String extractFactorialValue(String output) {
        String[] parts = output.split("Factorial: ");
        if (parts.length > 1) {
            return parts[1].trim().split("\n")[0];
        }
        return "";
    }
}
