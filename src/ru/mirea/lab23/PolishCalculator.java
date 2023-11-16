package ru.mirea.lab23;

import java.util.Scanner;
import java.util.Stack;

public class PolishCalculator {

    private final Scanner input = new Scanner(System.in);
    private final ArithmeticOperation[] arithmeticOperations = ArithmeticOperation.values();


    public double getResult(String[] strings) throws NotCorrectPolishNotationException {
        Stack<Double> stack = new Stack<>();
        for (String string : strings) {
            if (isNumber(string)) {
                stack.push(Double.parseDouble(string));
            } else if (isArithmeticOperation(string)) {
                try {
                    double temp2 = stack.pop();
                    double temp1 = stack.pop();

                    stack.push(ArithmeticOperation.values()[getIndexOfOperation(string)].action(temp1, temp2));

                } catch (Exception exception) {
                    throw  new NotCorrectPolishNotationException("Not correct notation form!!!");
                }

            } else {
                throw new NotCorrectPolishNotationException("Not correct notation form!!!");
            }
        }
        if (!stack.empty()) {
            return stack.pop();
        } else {
            throw new NotCorrectPolishNotationException("Not correct notation form!!!");
        }
    }

    private boolean isArithmeticOperation(String string) {
        for (ArithmeticOperation operation : arithmeticOperations) {
            if (operation.getSymbol().equals(string))
                return true;
        }
        return false;
    }

    private boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    private int getIndexOfOperation(String operation) {
        for (int i = 0; i < arithmeticOperations.length; i++) {
            if (arithmeticOperations[i].getSymbol().equals(operation))
                return i;
        }
        return 0;
    }

    public String[] readInputString() {
        System.out.print("Введите выражение: ");
        String string = input.nextLine();
        return string.split(" ");
    }
}
