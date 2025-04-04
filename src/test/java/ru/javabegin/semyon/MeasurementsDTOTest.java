package ru.javabegin.semyon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MeasurementsDTOTest {
    private MeasurementsDTO measurementsDTO;
    private Sensor sensor;

    @BeforeEach
    public void setUp() {
        measurementsDTO = new MeasurementsDTO();
        sensor = new Sensor();
    }

    @Test
    public void testSetAndGetSensor() {
        sensor.setName("Test Sensor");
        measurementsDTO.setSensor(sensor);
        assertEquals(sensor, measurementsDTO.getSensor());
    }

    @Test
    public void testSetAndGetValue() {
        float testValue = 42.5f;
        measurementsDTO.setValue(testValue);
        assertEquals(testValue, measurementsDTO.getValue());
    }

    @Test
    public void testSetAndGetRaining() {
        measurementsDTO.setRaining(true);
        assertTrue(measurementsDTO.isRaining());
        
        measurementsDTO.setRaining(false);
        assertFalse(measurementsDTO.isRaining());
    }

    @Test
    public void testToString() {
        sensor.setName("Test Sensor");
        measurementsDTO.setSensor(sensor);
        measurementsDTO.setValue(42.5f);
        measurementsDTO.setRaining(true);

        String expected = "MeasurementsDTO{sensor=Sensor{name='Test Sensor'}, value=42.5, raining=true}";
        assertEquals(expected, measurementsDTO.toString());
    }
} 