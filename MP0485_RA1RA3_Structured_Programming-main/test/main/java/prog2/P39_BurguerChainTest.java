package main.java.prog2;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class P39_BurguerChainTest {

    // Helper to simulate input/output
    private String simulateProgram(String userInput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            ByteArrayInputStream testIn = new ByteArrayInputStream(userInput.getBytes());
            ByteArrayOutputStream testOut = new ByteArrayOutputStream();

            System.setIn(testIn);
            System.setOut(new PrintStream(testOut));

            P39_BurguerChain.main(new String[0]);

            return testOut.toString();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testHeaderIsPrinted() {
        String input = "60\n60\n60\n60\n60\n60\n60\n".repeat(3); // 3 restaurants  7 days
        String output = simulateProgram(input);
        assertTrue(output.contains("Weekly Burger Sales Report"));
    }

    @Test(timeout = 1000)
    public void testAllRestaurantTotalsPrinted() {
        String input = String.join("\n",
            // R1: 760 = 420
            "60", "60", "60", "60", "60", "60", "60",
            // R2: 740 = 280
            "40", "40", "40", "40", "40", "40", "40",
            // R3: 7100 = 700
            "100", "100", "100", "100", "100", "100", "100"
        );
        String output = simulateProgram(input);
        assertTrue(output.contains("Total: 420 burgers"));
        assertTrue(output.contains("Total: 280 burgers"));
        assertTrue(output.contains("Total: 700 burgers"));
    }

    @Test(timeout = 1000)
    public void testLowSalesAreFlagged() {
        String input = String.join("\n",
            // R1: mix
            "60", "30", "50", "10", "100", "80", "70",
            // R2
            "70", "70", "70", "70", "70", "70", "70",
            // R3
            "20", "25", "30", "35", "40", "45", "49"
        );
        String output = simulateProgram(input);
        assertTrue(output.contains("30!"));
        assertTrue(output.contains("10!"));
        assertTrue(output.contains("20!"));
        assertTrue(output.contains("49!"));
    }

    @Test(timeout = 1000)
    public void testAllZeros() {
        String input = "0\n".repeat(21); // 37
        String output = simulateProgram(input);
        assertTrue(output.contains("Total: 0 burgers"));
        assertTrue(output.contains("0!"));
    }

    @Test(timeout = 1000)
    public void testMaximumValues() {
        String input = "120\n".repeat(21); // 37
        String output = simulateProgram(input);
        assertTrue(output.contains("Total: 840 burgers")); // 7120 = 840
        assertFalse(output.contains("!")); // No value < 50, no flags
    }
}
