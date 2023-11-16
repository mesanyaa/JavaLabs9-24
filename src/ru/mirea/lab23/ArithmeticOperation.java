package ru.mirea.lab23;

public enum ArithmeticOperation {
    ADDITION("+") {
        public double action(double x, double y) { return x + y; }
    }, SUBTRACTION("-") {
        public double action(double x, double y) { return x - y; }
    }, MULTIPLY("*") {
        public double action(double x, double y) { return x * y; }
    }, DIVISION("/") {
        public double action(double x, double y) { return x / y; }
    };

    private final String symbol;

    ArithmeticOperation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() { return symbol; }

    public abstract double action (double x, double y);
}