package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class P32_FromWhereToWhereTest {

    private void testOutput(String input, String expectedOutput) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            P32_FromWhereToWhere.main(new String[0]);

            String output = outContent.toString();
            // Normalize \n
            output = output.replace("\r\n", "\n").trim();
            expectedOutput = expectedOutput.replace("\r\n", "\n").trim();
            assertEquals(expectedOutput, output);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test(timeout = 1000)
    public void testFrom3To7() {
        String input = "7\n3\n"; // "Where to?" = 7, "Where from?" = 3
        String expected
                = "Where to? \n"
                + "Where from? \n"
                + "3\n4\n5\n6\n7";
        testOutput(input, expected);
    }

    @Test(timeout = 1000)
    public void testFrom5To5() {
        String input = "5\n5\n"; // same from and to
        String expected
                = "Where to? \n"
                + "Where from? \n"
                + "5\n";
        testOutput(input, expected);
    }

    @Test(timeout = 1000)
    public void testFrom10To7() {
        // from > to, so loop breaks and no numbers printed after prompt
        String input = "7\n10\n";
        String expected
                = "Where to? \n"
                + "Where from? \n";
        testOutput(input, expected);
    }
}
