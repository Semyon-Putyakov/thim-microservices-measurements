package ru.javabegin.semyon;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class RestTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    public void testPutMethod() throws Exception {
        Mockito.when(restTemplate.postForObject(anyString(), any(), any()))
                .thenReturn("success");

        mockMvc.perform(post("/measurements/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"value\":10.5,\"raining\":true,\"sensor\":{\"name\":\"test\"}}"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetMethod() throws Exception {
        Mockito.when(restTemplate.getForObject(anyString(), any()))
                .thenReturn("[{\"value\":10.5,\"raining\":true}]");

        mockMvc.perform(get("/measurements"))
                .andExpect(status().isOk());
    }
}
 