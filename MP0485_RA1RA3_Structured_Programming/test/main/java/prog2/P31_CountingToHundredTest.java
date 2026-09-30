package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P31_CountingToHundredTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P31_CountingToHundred.main(new String[0]);

            String output = outContent.toString();
            assertEquals(expectedOutput, output);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testCountingFrom95() {
        String input = "95\n";
        StringBuilder expected = new StringBuilder();
        for (int i = 95; i <= 100; i++) {
            expected.append(i).append(System.lineSeparator());
        }
        testOutput(input, expected.toString());
    }

    @Test(timeout = 1000)
    public void testCountingFrom100() {
        String input = "100\n";
        String expected = "100" + System.lineSeparator();
        testOutput(input, expected);
    }

    @Test(timeout = 1000)
    public void testCountingFrom0() {
        String input = "0\n";
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            expected.append(i).append(System.lineSeparator());
        }
        testOutput(input, expected.toString());
    }
}
