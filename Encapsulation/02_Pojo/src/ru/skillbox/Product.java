package ru.skillbox;

public class Product {
    private String name;
    public int price;
    private final String  barCode;

    private Product(String name, String  barCode) {
        this.name = name;
        this.barCode = barCode;

    }

    public void setNameName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBarCode() {
        return barCode;
    }
}

