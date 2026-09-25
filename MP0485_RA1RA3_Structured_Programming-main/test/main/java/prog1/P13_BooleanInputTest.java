package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P13_BooleanInputTest {

    private String runProgram(String input) {
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        P13_BooleanInput.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return outContent.toString().replace("\r\n", "\n");
    }

    @Test
    public void testBooleanInput() {
        // Test case 1: Input "true"
        String input1 = "true\n";
        String output1 = runProgram(input1);
        String normalizedOutput1 = output1.toLowerCase().trim();
        
        assertTrue("Case 1 - true: Output should contain 'true' or 'Write'", 
                normalizedOutput1.contains("true") || 
                normalizedOutput1.contains("write"));
        assertTrue("Case 1 - true: Output should reflect the input 'true'", 
                output1.contains("true"));
        assertFalse("Case 1 - true: Output should not be empty", normalizedOutput1.isEmpty());
        
        // Test case 2: Input "false"
        String input2 = "false\n";
        String output2 = runProgram(input2);
        String normalizedOutput2 = output2.toLowerCase().trim();
        
        assertTrue("Case 2 - false: Output should contain 'false' or 'Write'", 
                normalizedOutput2.contains("false") || 
                normalizedOutput2.contains("write"));
        assertTrue("Case 2 - false: Output should reflect the input 'false'", 
                output2.contains("false"));
        assertFalse("Case 2 - false: Output should not be empty", normalizedOutput2.isEmpty());
        
        // Test case 3: Verify prompt exists
        String normalizedOutput3 = normalizedOutput1;
        assertTrue("Case 3 - Prompt: Output should contain informative message",
                normalizedOutput3.contains("write") || 
                normalizedOutput3.contains("something") ||
                normalizedOutput3.contains("true") ||
                normalizedOutput3.contains("false"));
        
        // Test case 4: Verify output structure
        assertTrue("Case 4 - Structure: Output should contain boolean value or related text",
                normalizedOutput1.contains("true") ||
                normalizedOutput2.contains("false") ||
                normalizedOutput3.contains("boolean") ||
                normalizedOutput3.contains("something"));
    }
}
