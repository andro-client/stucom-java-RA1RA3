package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class P15_GiftTaxTest {

    private String runWithInput(String input) {
        InputStream sysInBackup = System.in; // backup System.in
        PrintStream sysOutBackup = System.out; // backup System.out
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        
        P15_GiftTax.main(new String[0]);
        
        System.setIn(sysInBackup);
        System.setOut(sysOutBackup);
        
        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testNoTaxBelow5000() {
        String input = "4999\n";
        String output = runWithInput(input);
        assertTrue(output.contains("No tax!"));
    }

    @Test
    public void testTaxBracket5000to25000() {
        String input = "10000\n"; 
        String output = runWithInput(input);
        // tax = 100 + (10000-5000)*0.08 = 100 + 400 = 500
        assertTrue(output.contains("Tax: 500.0"));
    }

    @Test
    public void testTaxBracket25001to55000() {
        String input = "30000\n"; 
        String output = runWithInput(input);
        // tax = 1700 + (30000-25000)*0.10 = 1700 + 5000*0.10 = 1700 + 500 = 2200
        assertTrue(output.contains("Tax: 2200.0"));
    }

    @Test
    public void testTaxBracket55001to200000() {
        String input = "100000\n"; 
        String output = runWithInput(input);
        // tax = 4700 + (100000-55000)*0.12 = 4700 + 45000*0.12 = 4700 + 5400 = 10100
        assertTrue(output.contains("Tax: 10100.0"));
    }

    @Test
    public void testTaxBracket200001to1000000() {
        String input = "500000\n"; 
        String output = runWithInput(input);
        // tax = 22100 + (500000-200000)*0.15 = 22100 + 300000*0.15 = 22100 + 45000 = 67100
        assertTrue(output.contains("Tax: 67100.0"));
    }

    @Test
    public void testTaxAbove1000000() {
        String input = "2000000\n"; 
        String output = runWithInput(input);
        // tax = 142100 + (2000000-1000000)*0.17 = 142100 + 1000000*0.17 = 142100 + 170000 = 312100
        assertTrue(output.contains("Tax: 312100.0"));
    }
}
