package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P10_VariousVariablesTest {

    @Test
    public void testVariablesOutput() {
        // Backup original System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        // Redirect System.out to capture output
        System.setOut(new PrintStream(outContent));
        
        // Run the program
        P10_VariousVariables.main(new String[0]);
        
        // Restore original System.out
        System.setOut(originalOut);
        
        // Expected output lines
        String expectedOutput = String.join("\n",
            "Chicken:",
            "9000",
            "Bacon (kg):",
            "0.1",
            "Tractor:",
            "Zetor",
            "",
            "And finally, a summary:",
            "9000",
            "0.1",
            "Zetor"
        );
        
        // Normalize line endings and trim
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();
        
        // Assert the output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
