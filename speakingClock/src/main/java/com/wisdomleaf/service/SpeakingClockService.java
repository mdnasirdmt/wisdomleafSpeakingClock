package com.wisdomleaf.service;

import org.springframework.stereotype.Service;
import java.time.LocalTime;
@Service
public class SpeakingClockService {
    /**
     * This method is used to convert time to words
     * @param time
     * @return
     */
    public String convertTimeToWords(LocalTime time) {
        int hour = time.getHour();
        int minute = time.getMinute();

        if (hour == 00 && minute == 00) {
            return "Midnight";
        } else if (hour == 12 && minute == 00) {
            return "Midday";
        }
        String hourInWords = convertToWords(hour);
        String minuteInWords = convertToWords(minute);
        return hourInWords + " " + minuteInWords;
    }

    /**
     * this method is taking integer and converting it to minutes and hours
     * Implement the logic to convert the number to words
     * You can use a lookup table, switch-case statements, or any other approach
     * Example implementation for hours 1-12 and minutes 0-59:
     * @param number
     * @return
     */
    public String convertToWords(int number) {
        String[] hours = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four"};

        String[] minutes = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
                "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three",
                "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
                "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
                "forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four",
                "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine"};

        // Adjust the logic based on your specific requirements and number-to-word mapping
        try {
            if (number >= 1 && number <= 23) {
                return hours[number];
            } else if (number >= 0 && number <= 59) {
                return minutes[number];
            } else {
                throw new IllegalArgumentException("Invalid number: " + number);
            }
        } catch (IllegalArgumentException e) {
            // Handle the exception here
            return e.getMessage(); // Return an appropriate value or handle the error case
        }
    }
}
