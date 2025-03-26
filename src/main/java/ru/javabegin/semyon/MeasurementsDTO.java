package ru.javabegin.semyon;

public class MeasurementsDTO {
    private Sensor sensor;
    private float value;
    private boolean raining;

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    @Override
    public String toString() {
        return "MeasurementsDTO{" +
                "sensor=" + sensor +
                ", value=" + value +
                ", raining=" + raining +
                '}';
    }
}
