package ru.javabegin.semyon;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Rest {
    public void put(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/measurements/add";

        Map<String, Object> name = new HashMap<>();
        name.put("name", "test");

        for(int i = 0; i < 1000; i++){
            Map<String, Object> sensor = new HashMap<>();
            Random random = new Random();
            float min = -100.0f;
            float max = 100.0f;
            float rangedValue = min + random.nextFloat() * (max - min);
            boolean bool = random.nextBoolean();
            sensor.put("value", rangedValue);
            sensor.put("raining", bool);
            sensor.put("sensor", name);

            HttpEntity<Map<String,Object>> request = new HttpEntity<>(sensor);
            String response = restTemplate.postForObject(url,request,String.class);
            System.out.println(response);
        }
    }
    public void get(){
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/measurements";
        List<MeasurementsDTO> measurementsDTO = restTemplate.getForObject(url, List.class);
        System.out.println(measurementsDTO);
    }
}
