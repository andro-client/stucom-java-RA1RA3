package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P09_StoryTest {

    @Test
    public void testStoryOutput() {
        // Simulate user input: two lines, name and job
        String simulatedInput = "Alice\nscientist\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P09_Story.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output string
        String expectedOutput = String.join("\n",
            "I will tell you a story, but I need some information first.",
            "What is the main character called?",
            "What is their job?",
            "Here is the story:",
            "Once upon a time there was Alice, who was scientist.",
            "On the way to work, Alice reflected on life.",
            "Perhaps Alice will not be scientist forever."
        );

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}
