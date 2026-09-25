package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P01_SpeedingTicketTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P01_SpeedingTicket.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testSpeedingTicketOverLimit() {
        String output = runWithInput("130\n"); // over speed limit
        assertTrue("Expected speeding ticket message missing", output.contains("Speeding ticket!"));
    }

    @Test
    public void testSpeedingTicketAtLimit() {
        String output = runWithInput("120\n"); // at speed limit
        assertFalse("Speeding ticket message should NOT be printed", output.contains("Speeding ticket!"));
    }

    @Test
    public void testSpeedingTicketBelowLimit() {
        String output = runWithInput("90\n"); // well below limit
        assertFalse("Speeding ticket message should NOT be printed", output.contains("Speeding ticket!"));
    }

    @Test
    public void testSpeedingTicketJustAboveLimit() {
        String output = runWithInput("121\n"); // just above limit
        assertTrue("Expected speeding ticket message missing", output.contains("Speeding ticket!"));
    }
}
