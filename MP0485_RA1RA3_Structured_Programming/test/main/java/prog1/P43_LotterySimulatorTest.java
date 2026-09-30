package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P43_LotterySimulatorTest {

    @Test
    public void testLotteryNumbersRangeAndCount() {
        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        P43_LotterySimulator.main(new String[0]);

        // Restore original System.out
        System.setOut(originalOut);

        String output = outContent.toString().trim();

        // Expected output starts with "Your numbers: "
        assertTrue("Output should start with 'Your numbers: '", output.startsWith("Your numbers: "));

        // Extract the numbers part (after the label)
        String numbersPart = output.substring("Your numbers: ".length()).trim();

        // Split numbers by space
        String[] numbersStr = numbersPart.split("\\s+");

        // Check count = 6
        assertEquals("Should print exactly 6 numbers", 6, numbersStr.length);

        // Check each number is integer between 1 and 49
        for (String numStr : numbersStr) {
            int num = Integer.parseInt(numStr);
            assertTrue("Number should be >= 1", num >= 1);
            assertTrue("Number should be <= 49", num <= 49);
        }
    }
}
