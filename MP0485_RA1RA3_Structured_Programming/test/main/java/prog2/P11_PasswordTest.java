package main.java.prog2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P11_PasswordTest {

    private String runWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        P11_Password.main(new String[0]);

        System.setOut(originalOut);
        System.setIn(System.in);

        return out.toString().replace("\r\n", "\n").trim();
    }

    @Test
    public void testCorrectPassword() {
        String output = runWithInput("Caput Draconis\n");
        assertEquals("Password?\nWelcome!", output);
    }

    @Test
    public void testIncorrectPassword() {
        String output = runWithInput("WrongPassword\n");
        assertEquals("Password?\nOff with you!", output);
    }
}
