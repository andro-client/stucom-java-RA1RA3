package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class P44_CustomerArrivalTest {

    @Test
    public void testCustomerArrivalTimesAndAverage() {
        // Capture System.out output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P44_CustomerArrival.main(new String[0]);

        // Restore original System.out
        System.setOut(originalOut);

        String output = outContent.toString().trim();
        String[] lines = output.split("\\r?\\n");

        // Expect 6 lines: 5 customers + average
        assertEquals("Should output 6 lines", 6, lines.length);

        int previousArrivalTime = 0;
        int totalArrivalTime = 0;

        // Check lines 0-4: customer arrival lines
        for (int i = 0; i < 5; i++) {
            String line = lines[i].trim();

            // Example format: "Customer 1 arrived at minute: 7"
            assertTrue("Line " + (i+1) + " should start with 'Customer " + (i+1) + " arrived at minute: '",
                    line.startsWith("Customer " + (i + 1) + " arrived at minute: "));

            // Extract the minute value
            String[] parts = line.split(": ");
            assertEquals("Line " + (i+1) + " should contain ':'", 2, parts.length);

            int arrivalTime;
            try {
                arrivalTime = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                fail("Arrival time should be an integer at line " + (i+1));
                return;
            }

            // Check arrival time is strictly increasing
            assertTrue("Arrival time should be greater than previous arrival time",
                    arrivalTime > previousArrivalTime);

            // Calculate wait time (difference)
            int waitTime = arrivalTime - previousArrivalTime;
            assertTrue("Wait time should be between 1 and 10 minutes",
                    waitTime >= 1 && waitTime <= 10);

            previousArrivalTime = arrivalTime;
            totalArrivalTime = arrivalTime; // last arrival time will be total time
        }

        // Check average waiting time line
        String avgLine = lines[5].trim();
        assertTrue("Average waiting time line should start with 'Average waiting time:'",
                avgLine.startsWith("Average waiting time: "));

        // Parse average time
        String avgStr = avgLine.replace("Average waiting time:", "").replace("minutes", "").trim();
        double avgValue;
        try {
            avgValue = Double.parseDouble(avgStr);
        } catch (NumberFormatException e) {
            fail("Average waiting time should be a decimal number");
            return;
        }

        // Average wait time should be totalArrivalTime / 5 customers 
        double expectedAvg = (double) totalArrivalTime / 5;
        // Allow a small epsilon difference due to formatting
        assertEquals(expectedAvg, avgValue, 0.01);
    }
}
