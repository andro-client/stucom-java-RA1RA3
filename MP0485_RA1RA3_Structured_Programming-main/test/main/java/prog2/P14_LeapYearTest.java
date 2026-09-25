package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P14_LeapYearTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P14_LeapYear.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testYearNotDivisibleBy4() {
        String input = "2019\n";
        String expected = "Give a year: \nThe year is not a leap year.";
        String output = runWithInput(input);
        assertEquals("2019 is not a leap year", expected, output);
    }

    @Test
    public void testYearDivisibleBy400() {
        String input = "2000\n";
        String expected = "Give a year: \nThe year is a leap year.";
        String output = runWithInput(input);
        assertEquals("2000 is a leap year", expected, output);
    }

    @Test
    public void testYearDivisibleBy100ButNot400() {
        String input = "1900\n";
        String expected = "Give a year: \nThe year is not a leap year.";
        String output = runWithInput(input);
        assertEquals("1900 is not a leap year", expected, output);
    }

    @Test
    public void testYearDivisibleBy4ButNot100() {
        String input = "2016\n";
        String expected = "Give a year: \nThe year is a leap year.";
        String output = runWithInput(input);
        assertEquals("2016 is a leap year", expected, output);
    }
}
