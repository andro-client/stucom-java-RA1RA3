package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P10_OddOrEvenTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P10_OddOrEven.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testOddOrEven() {
        // Test case 1: Even number (4)
        String output1 = runWithInput("4\n");
        String expectedOutput1 = "Give a number:\nNumber 4 is even.";
        assertEquals("Test case 1 (even number 4): Expected '" + expectedOutput1 + "', but got '" + output1 + "'", 
                expectedOutput1, output1);
        
        // Test case 2: Odd number (7)
        String output2 = runWithInput("7\n");
        String expectedOutput2 = "Give a number:\nNumber 7 is odd.";
        assertEquals("Test case 2 (odd number 7): Expected '" + expectedOutput2 + "', but got '" + output2 + "'", 
                expectedOutput2, output2);
        
        // Test case 3: Zero (even)
        String output3 = runWithInput("0\n");
        String expectedOutput3 = "Give a number:\nNumber 0 is even.";
        assertEquals("Test case 3 (zero): Expected '" + expectedOutput3 + "', but got '" + output3 + "'", 
                expectedOutput3, output3);
        
        // Test case 4: Negative odd number (-3)
        String output4 = runWithInput("-3\n");
        String expectedOutput4 = "Give a number:\nNumber -3 is odd.";
        assertEquals("Test case 4 (negative odd -3): Expected '" + expectedOutput4 + "', but got '" + output4 + "'", 
                expectedOutput4, output4);
        
        // Test case 5: Negative even number (-8)
        String output5 = runWithInput("-8\n");
        String expectedOutput5 = "Give a number:\nNumber -8 is even.";
        assertEquals("Test case 5 (negative even -8): Expected '" + expectedOutput5 + "', but got '" + output5 + "'", 
                expectedOutput5, output5);
        
        // Test case 6: Large even number
        String output6 = runWithInput("100\n");
        String expectedOutput6 = "Give a number:\nNumber 100 is even.";
        assertEquals("Test case 6 (large even 100): Expected '" + expectedOutput6 + "', but got '" + output6 + "'", 
                expectedOutput6, output6);
        
        // Test case 7: Large odd number
        String output7 = runWithInput("99\n");
        String expectedOutput7 = "Give a number:\nNumber 99 is odd.";
        assertEquals("Test case 7 (large odd 99): Expected '" + expectedOutput7 + "', but got '" + output7 + "'", 
                expectedOutput7, output7);
    }
}