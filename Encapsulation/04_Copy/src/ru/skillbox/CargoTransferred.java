package ru.skillbox;

public class CargoTransferred {

    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean turnBox;
    private final String registrationNumber;
    private final boolean fragile;


    public CargoTransferred(Dimensions dimensions, double weight, String address, boolean turnBox, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.turnBox = turnBox;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;

    }

    public CargoTransferred setDimensions(Dimensions dimensions) {
        return new CargoTransferred(dimensions, weight, address, turnBox, registrationNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public CargoTransferred setWeight(double weight) {
        return new CargoTransferred(dimensions, weight, address, turnBox, registrationNumber, fragile);
    }

    public double getWeight() {
        return weight;
    }

    public CargoTransferred setAddress(String address) {
        return new CargoTransferred(dimensions, weight, address, turnBox, registrationNumber, fragile);
    }

    public String getAddress() {
        return address;
    }

    public CargoTransferred setTurnBox(boolean turnBox) {
        return new CargoTransferred(dimensions, weight, address, turnBox, registrationNumber, fragile);

    }

    public boolean getTurnBox() {
        return turnBox;
    }

    public CargoTransferred setRegistrationNumber(String registrationNumber) {
        return new CargoTransferred(dimensions, weight, address, turnBox, registrationNumber, fragile);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CargoTransferred setFragile(boolean fragile) {
        return new CargoTransferred(dimensions, weight, address, turnBox, registrationNumber, fragile);
    }

    public boolean getFragile() {
        return fragile;
    }

    public String toString() {
        return "Вес: " + getWeight() + " гр." + "\n" + "Адрес: " + getAddress() + "\n" + getDimensions() +
                "\n" + "Регистрационный номер: " + getRegistrationNumber() + "\n" +
                "Можно переворачивать: " + (getTurnBox() ? "да" : "нет") + "\n" + "Хрупкий груз: " +
                (getFragile() ? "да" : "нет");
    }

}




