package ru.skillbox;

public class ArithmeticCalculator {

    public static int a;
    public static int b;

    public ArithmeticCalculator(int a, int b) {
        ArithmeticCalculator.a = a;
        ArithmeticCalculator.b = b;
    }

    public static int calculate(Operation operation) {
        return switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;

        };

    }
}
