package main.java.prog1;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P08_ConversationTest {

    @Test
    public void testConversationOutput() {
        // Simulate two user inputs (two lines), content doesn't matter since it's ignored
        String simulatedInput = "I'm fine\nTell you more\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inContent);

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        P08_Conversation.main(new String[0]);

        // Restore System.out and System.in
        System.setOut(originalOut);
        System.setIn(System.in);

        // Expected output lines exactly as printed
        String expectedOutput = String.join("\n",
            "Greetings! How are you doing?",
            "Oh, how interesting. Tell me more!",
            "Thanks for sharing!"
        );

        // Normalize line endings and trim whitespace
        String actualOutput = outContent.toString().replace("\r\n", "\n").trim();

        // Assert output matches expected
        assertEquals(expectedOutput, actualOutput);
    }
}