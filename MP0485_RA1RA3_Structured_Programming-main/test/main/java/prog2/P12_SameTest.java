package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P12_SameTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P12_Same.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testSameStrings() {
        String input = "hello\nhello\n";
        String expected = "Enter the first string:\nEnter the second string:\nSame";
        String output = runWithInput(input);
        assertEquals("Output should print 'Same' when strings are equal", expected, output);
    }

    @Test
    public void testDifferentStrings() {
        String input = "hello\nworld\n";
        String expected = "Enter the first string:\nEnter the second string:\nDifferent";
        String output = runWithInput(input);
        assertEquals("Output should print 'Different' when strings differ", expected, output);
    }

    @Test
    public void testDifferentStringsCase() {
        String input = "Hello\nhello\n";
        String expected = "Enter the first string:\nEnter the second string:\nDifferent";
        String output = runWithInput(input);
        assertEquals("Output should print 'Different' for inputs 'Hello' and 'hrllo'", expected, output);
    }

    @Test
    public void testDifferentStringsCase2() {
        String input = "ABC\nabc\n";
        String expected = "Enter the first string:\nEnter the second string:\nDifferent";
        String output = runWithInput(input);
        assertEquals("Output should print 'Different' for inputs 'abc' and 'xyz'", expected, output);
    }
}
