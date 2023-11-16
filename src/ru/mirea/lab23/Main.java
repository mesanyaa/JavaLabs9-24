package ru.mirea.lab23;

public class Main {
    public static void main(String[] args) throws NotCorrectPolishNotationException {

        PolishCalculator polishCalculator = new PolishCalculator();
        System.out.println(polishCalculator.getResult(polishCalculator.readInputString()));
    }
}