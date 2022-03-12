package ru.skillbox;

public class Processor {

    private final int frequency;
    private final int core;
    private final String manufacturer;
    private final double weight;

    public Processor(int frequency, int core, String manufacturer, double weight) {
        this.frequency = frequency;
        this.core = core;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCore() {
        return core;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return frequency + " МГц. " + core + " ядра. " + manufacturer + " " + weight + " гр. ";

    }
}
