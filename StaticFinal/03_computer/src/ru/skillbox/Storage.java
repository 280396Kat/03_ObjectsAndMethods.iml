package ru.skillbox;

public class Storage {


    private final StorageType type;
    private final int memory;
    private final double weight;

    public Storage(StorageType type, int memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    public StorageType getType() {
        return type;
    }
    public int getMemory() {
        return memory;
    }
    public double getWeight() {
        return weight;
    }
    public String toString() {
        return type + " " + memory + " Гб. " + weight + " гр. ";

    }
}
