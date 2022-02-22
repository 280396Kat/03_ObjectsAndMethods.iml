package ru.skillbox;

public class Country {


    private String nameCountry;
    private int populationSize;
    private double countryArea;
    private String nameCapital;
    private boolean exitSea;


    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }


    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean isExitSea() {
        return exitSea;
    }

    public void setExitSea(boolean exitSea) {
        this.exitSea = exitSea;
    }


}
