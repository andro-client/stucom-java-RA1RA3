package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P03_AncientTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P03_Ancient.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testPrintAncientForYearBefore2015() {
        String output = runWithInput("1999\n");
        assertTrue("Expected output to contain 'Ancient history!'", 
                   output.contains("Ancient history!"));
    }

    @Test
    public void testNoOutputForYear2015() {
        String output = runWithInput("2015\n");
        assertFalse("Output should not contain 'Ancient history!'", 
                    output.contains("Ancient history!"));
    }
    
    @Test
    public void testNoOutputForYearAfter2015() {
        String output = runWithInput("2020\n");
        assertFalse("Output should not contain 'Ancient history!'", 
                    output.contains("Ancient history!"));
    }
    
    @Test
    public void testPrintAncientForYearFarPast() {
        String output = runWithInput("1800\n");
        assertTrue("Expected output to contain 'Ancient history!'", 
                   output.contains("Ancient history!"));
    }
}
