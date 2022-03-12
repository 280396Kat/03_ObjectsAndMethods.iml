package ru.skillbox;


import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("ПК", "США",
        new Processor(16, 2, "HP", 3500),
        new Ram("DDR3", 4, 250),
        new Storage(StorageType.HDD, 1024, 300),
        new Screen(17.7, ScreenType.IPS, 1.2),
        new Keyboard("Механическая", true, 340));

        System.out.println(computer);
    }
}
