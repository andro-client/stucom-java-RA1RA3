package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P48_YearlySavingsTest {

    @Test
    public void testYearlySavingsOutput() {
        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main
        P48_YearlySavings.main(new String[0]);

        // Restore System.out
        System.setOut(originalOut);

        // Normalize output and split into lines
        String output = outContent.toString().replace("\r\n", "\n").trim();
        String[] lines = output.split("\n");

        // Expected results calculated manually from given code:
        // monthlyEarnings = 4200, months = 12 => 4200 * 12 = 50400
        // quarterlyBonus = 1500 * 4 = 6000
        // grossIncome = 50400 + 6000 = 56400, rounded = 56400

        // coworkingCost + subscriptionCost = 250 + 300 = 550
        // totalExpenses = 550 * 12 = 6600
        // netBeforeTax = 56400 - 6600 = 49800, rounded = 49800

        // finalEarnings = 49800 * (1 - 0.18) = 49800 * 0.82 = 40836, rounded = 40836

        assertEquals("Expected 3 output lines", 3, lines.length);

        assertEquals("Gross income line is incorrect",
            "Gross income: 56400$", lines[0].trim());

        assertEquals("Net income before tax line is incorrect",
            "Net income before tax: 49800$", lines[1].trim());

        assertEquals("Final earnings after tax line is incorrect",
            "Final earnings after tax: 40836$", lines[2].trim());
    }
}
