package ru.javabegin.semyon;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Measurements {
    public static void main(String[] args) {
        Rest rest = new Rest();
        rest.get();
    }
}
