package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class P02_AdaLovelaceTest {

    @Test
    public void testOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        P02_AdaLovelace.main(new String[0]);

        System.setOut(originalOut);

        assertEquals("Ada Lovelace", outContent.toString().trim());
    }
}
