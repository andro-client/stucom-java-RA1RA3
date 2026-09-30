package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P06_LargerThanOrEqualToTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P06_LargerThanOrEqualTo.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testFirstGreater() {
        String input = "10\n5\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Greater number is: 10'", 
            output.contains("Greater number is: 10"));
    }

    @Test
    public void testSecondGreater() {
        String input = "7\n15\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'Greater number is: 15'", 
            output.contains("Greater number is: 15"));
    }

    @Test
    public void testNumbersEqual() {
        String input = "8\n8\n";
        String output = runWithInput(input);

        assertTrue("Output should contain 'The numbers are equal!'", 
            output.contains("The numbers are equal!"));
    }
}
