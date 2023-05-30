package com.wisdomleaf.controller;

import com.wisdomleaf.service.SpeakingClockService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Tag(name = "Speaking clock", description = "Speaking clock API")
@RestController
public class SpeakingClockController {
    @Autowired
    private SpeakingClockService clockService;
    @GetMapping("/current-time")
    public ResponseEntity<?> getCurrentTimeInWords(@RequestParam("time") String time) {
        String regex = "^[0-9:]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        boolean isMatch = matcher.matches();
        if (isMatch) {
            LocalTime localTime = LocalTime.parse(time);
            String timeInWords = this.clockService.convertTimeToWords(localTime);
            return new ResponseEntity<>("It's " + timeInWords, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Please Enter Valid Time", HttpStatus.BAD_REQUEST);
        }
    }
}