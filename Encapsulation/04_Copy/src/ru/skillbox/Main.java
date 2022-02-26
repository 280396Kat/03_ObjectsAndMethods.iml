package ru.skillbox;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(55, 55, 55);
        dimensions = dimensions.setLength(16);
        dimensions = dimensions.setWidth(20);
        dimensions = dimensions.setHeight(21);

        CargoTransferred cargoTransferred = new CargoTransferred(dimensions, 51, "г.Сочи ул. Урицкого д. 18",
                true, "а7аов", true);
        cargoTransferred = cargoTransferred.setAddress("г.Сочи, Адлерский район, ул. Бакинская, дом 15.");
        cargoTransferred = cargoTransferred.setRegistrationNumber("а764о7");
        System.out.println(cargoTransferred);

        CargoTransferred copy = new CargoTransferred(
                cargoTransferred.getDimensions(),
                cargoTransferred.getWeight(),
                cargoTransferred.getAddress(),
                cargoTransferred.getTurnBox(),
                cargoTransferred.getRegistrationNumber(),
                cargoTransferred.getFragile());
        System.out.println(copy);





    }
}