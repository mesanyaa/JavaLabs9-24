package practica_18;

public class ThrowsDemo_main {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
//        throwsDemo.getDetails(null);
        // Вызываем метод с правильным значением ключа
        String validKey = "example";
        throwsDemo.printMessage(validKey);

        // Вызываем метод с null в качестве значения ключа
        String nullKey = null;
        throwsDemo.printMessage(nullKey);
    }
}
