package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        String expected = "Hello, Test!";
        String actual = generateMessage();
        assertEquals(expected, actual, "The generated message should match the expected value.");
    }

    private String generateMessage() {
        return "Hello, Test!";
    }
}
