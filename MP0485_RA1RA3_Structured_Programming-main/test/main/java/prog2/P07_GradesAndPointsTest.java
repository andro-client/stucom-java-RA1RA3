package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P07_GradesAndPointsTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P07_GradesAndPoints.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testImpossibleBelowZero() {
        String input = "-1\n";
        String output = runWithInput(input);
        assertTrue("Expected output to contain 'impossible!'", output.contains("impossible!"));
    }

    @Test
    public void testFailedRange() {
        String[] inputs = {"0\n", "49\n"};
        for (String input : inputs) {
            String output = runWithInput(input);
            assertTrue("Expected output to contain 'failed' for input " + input, output.contains("failed"));
        }
    }

    @Test
    public void testGrade1Range() {
        String[] inputs = {"50\n", "59\n"};
        for (String input : inputs) {
            String output = runWithInput(input);
            assertTrue("Expected output to contain '1' for input " + input, output.contains("\n1\n") || output.endsWith("1"));
        }
    }

    @Test
    public void testGrade2Range() {
        String[] inputs = {"60\n", "69\n"};
        for (String input : inputs) {
            String output = runWithInput(input);
            assertTrue("Expected output to contain '2' for input " + input, output.contains("\n2\n") || output.endsWith("2"));
        }
    }

    @Test
    public void testGrade3Range() {
        String[] inputs = {"70\n", "79\n"};
        for (String input : inputs) {
            String output = runWithInput(input);
            assertTrue("Expected output to contain '3' for input " + input, output.contains("\n3\n") || output.endsWith("3"));
        }
    }

    @Test
    public void testGrade4Range() {
        String[] inputs = {"80\n", "89\n"};
        for (String input : inputs) {
            String output = runWithInput(input);
            assertTrue("Expected output to contain '4' for input " + input, output.contains("\n4\n") || output.endsWith("4"));
        }
    }

    @Test
    public void testGrade5Range() {
        String[] inputs = {"90\n", "100\n"};
        for (String input : inputs) {
            String output = runWithInput(input);
            assertTrue("Expected output to contain '5' for input " + input, output.contains("\n5\n") || output.endsWith("5"));
        }
    }

    @Test
    public void testIncredibleAbove100() {
        String input = "101\n";
        String output = runWithInput(input);
        assertTrue("Expected output to contain 'incredible!'", output.contains("incredible!"));
    }
}
