package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
public class HelloControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloReturnsExpectedMessage() throws Exception {
        mockMvc.perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(content().string(
            "Hello Spring Boot on GitHub Codespaces!"
        ));
    }

}
