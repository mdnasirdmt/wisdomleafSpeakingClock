package com.wisdomleaf.serviceTest;

import com.wisdomleaf.service.SpeakingClockService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;

public class SpeakingClockServiceTest {

    private SpeakingClockService speakingClockService;

    @BeforeEach
    public void setup() {
        speakingClockService = new SpeakingClockService();
    }

    @Test
    public void testConvertTimeToWords() {
        // Test case for a specific time
        LocalTime time = LocalTime.of(9, 30);
        String expected = "nine thirty";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testConvertToWords() {
        // Test case for a specific number
        int number = 12;
        String expected = "twelve";
        String result = speakingClockService.convertToWords(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testInvalidNumber() {
        // Test case for an invalid number
        int number = 60; // Assuming the range is 0-59
        String expected = "Invalid number: " + number;
        String result = speakingClockService.convertToWords(number);
        Assertions.assertEquals(expected, result);
    }
}
