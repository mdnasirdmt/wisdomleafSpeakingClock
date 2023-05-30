package com.wisdomleaf.controllerTest;

import com.wisdomleaf.service.SpeakingClockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class SpeakingClockControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private SpeakingClockService clockService;

    @Test
    public void testGetCurrentTimeInWords_ValidTime() throws Exception {
        String time = "12:30";
        LocalTime localTime = LocalTime.parse(time);
        String expectedResponse = "It's twelve thirty";

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/current-time")
                        .param("time", time)
                        .accept(MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String responseContent = result.getResponse().getContentAsString();
        assertEquals( expectedResponse, responseContent);
    }

    @Test
    public void testGetCurrentTimeInWords_InvalidTime() throws Exception {
        String time = "@12:30:45";
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/current-time")
                        .param("time", time)
                        .accept(MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andReturn();

        String responseContent = result.getResponse().getContentAsString();
        assertEquals("Please Enter Valid Time", responseContent);
    }
}
