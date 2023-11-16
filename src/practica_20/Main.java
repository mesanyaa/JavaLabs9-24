package practica_20;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Создать обобщенный класс с тремя параметрами
        MyGenericClass<Integer, String, Double> genericObject = new MyGenericClass<>(42, "Hello", 3.14);
        System.out.println("Value of T: " + genericObject.getValue1());
        System.out.println("Value of V: " + genericObject.getValue2());
        System.out.println("Value of K: " + genericObject.getValue3());
        genericObject.printClassNames();
        System.out.println();


        // Задание 3: Написать обобщенный класс MinMax
        Integer[] intArray = {3, 8, 1, 5, 7};
        MinMax<Integer> minMaxInteger = new MinMax<>(intArray);
        System.out.println("Min: " + minMaxInteger.findMin());
        System.out.println("Max: " + minMaxInteger.findMax());
        System.out.println();

        // Задание 4: Написать класс Калькулятор
        double resultSum = Calculator.sum(10, 5);
        System.out.println("Sum: " + resultSum);
        double resultMultiply = Calculator.multiply(10, 5);
        System.out.println("Multiply: " + resultMultiply);
        double resultDivide = Calculator.divide(10, 5);
        System.out.println("Divide: " + resultDivide);
        double resultSubtraction = Calculator.subtraction(10, 5);
        System.out.println("Subtraction: " + resultSubtraction);
        System.out.println();

    }
}

