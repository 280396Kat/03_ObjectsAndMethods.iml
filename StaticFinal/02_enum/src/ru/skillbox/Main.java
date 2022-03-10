package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(2,4);
        System.out.println("Сложение: " + ArithmeticCalculator.calculate(Operation.ADD));
        System.out.println("Вычитание: " + ArithmeticCalculator.calculate(Operation.SUBTRACT));
        System.out.println("Умножение: " + ArithmeticCalculator.calculate(Operation.MULTIPLY));



    }
}
