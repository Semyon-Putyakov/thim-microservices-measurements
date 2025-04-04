package ru.javabegin.semyon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class SensorTest {
    private Sensor sensor;

    @BeforeEach
    public void setUp() {
        sensor = new Sensor();
    }

    @Test
    public void testSetAndGetName() {
        String testName = "Test Sensor";
        sensor.setName(testName);
        assertEquals(testName, sensor.getName());
    }

    @Test
    public void testToString() {
        String testName = "Test Sensor";
        sensor.setName(testName);
        String expected = "Sensor{name='" + testName + "'}";
        assertEquals(expected, sensor.toString());
    }
} 