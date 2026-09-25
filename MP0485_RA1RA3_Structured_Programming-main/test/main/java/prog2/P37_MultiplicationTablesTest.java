package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P37_MultiplicationTablesTest {

    private String getOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            P37_MultiplicationTables.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }
        return outContent.toString().replace("\r\n", "\n");
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

    @Test(timeout = 1000)
    public void testProgram() {
        String output = getOutput();
        final String LINES = "----------------------------";

        // Test case 1: Verify table headers are present
        for (int table = 1; table <= 10; table++) {
            String header = "Multiplication Table of " + table;
            assertTrue("Test case 1 (" + table + "): Header missing: '" + header + "'", 
                output.contains(header));
        }

        // Test case 2: Verify separator line is present for each table
        int separatorCount = countOccurrences(output, LINES);
        assertEquals("Test case 2: Expected 10 separator lines (one per table), but got " + separatorCount, 
            10, separatorCount);

        // Test case 3: Verify specific multiplication results
        assertEquals("Test case 3a: Contains '2 x 3 = 6'", 
            true, output.contains("2 x 3 = 6"));
        assertEquals("Test case 3b: Contains '5 x 7 = 35'", 
            true, output.contains("5 x 7 = 35"));
        assertEquals("Test case 3c: Contains '10 x 10 = 100'", 
            true, output.contains("10 x 10 = 100"));

        // Test case 4: Verify each table has exactly 10 multiplication lines
        for (int table = 1; table <= 10; table++) {
            int count = countOccurrences(output, table + " x ");
            assertEquals("Test case 4 (table " + table + "): Expected 10 lines for 'x 1' through 'x 10', but got " + count, 
                10, count);
        }

        // Test case 5: Verify all numbers 1-10 appear in first table
        String[] expectedInTable1 = {
            "1 x 1 = 1", "1 x 2 = 2", "1 x 3 = 3", "1 x 4 = 4", "1 x 5 = 5",
            "1 x 6 = 6", "1 x 7 = 7", "1 x 8 = 8", "1 x 9 = 9", "1 x 10 = 10"
        };
        for (String line : expectedInTable1) {
            assertTrue("Test case 5 (table 1): Missing line '" + line + "'", output.contains(line));
        }

        // Test case 6: Verify all numbers 1-10 appear in 10th table
        String[] expectedInTable10 = {
            "10 x 1 = 10", "10 x 2 = 20", "10 x 3 = 30", "10 x 4 = 40", "10 x 5 = 50",
            "10 x 6 = 60", "10 x 7 = 70", "10 x 8 = 80", "10 x 9 = 90", "10 x 10 = 100"
        };
        for (String line : expectedInTable10) {
            assertTrue("Test case 6 (table 10): Missing line '" + line + "'", output.contains(line));
        }

        // Test case 7: Verify output format - starts with newlines before first table
        assertTrue("Test case 7: Output should start with newlines before first table", 
            output.startsWith("\n\nMultiplication Table of 1"));

        // Test case 8: Verify total output contains all 100 multiplication results (10 tables x 10 results each)
        int totalMultiplications = 0;
        for (int table = 1; table <= 10; table++) {
            for (int i = 1; i <= 10; i++) {
                String line = table + " x " + i + " = " + (table * i);
                if (output.contains(line)) {
                    totalMultiplications++;
                }
            }
        }
        assertEquals("Test case 8: Expected 100 multiplication results, but got " + totalMultiplications, 
            100, totalMultiplications);
    }
}
