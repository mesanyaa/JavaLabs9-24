package practica_21;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Метод для конвертации массива строк/чисел в список
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"One", "Two", "Three", "Four", "Five"};

        List<Integer> intList = Converter.arrayToList(intArray);
        List<String> stringList = Converter.arrayToList(stringArray);

        System.out.println("Integer List: " + intList);
        System.out.println("String List: " + stringList);

        // Задание 2: Класс, который хранит в себе массив любых типов данных
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        GenericArray<Double> doubleArrayHolder = new GenericArray<>(doubleArray);

        String[] stringArray2 = {"A", "B", "C", "D", "E"};
        GenericArray<String> stringArrayHolder = new GenericArray<>(stringArray2);

        System.out.println("Double Element: " + doubleArrayHolder.getElement(2));
        System.out.println("String Element: " + stringArrayHolder.getElement(3));

        // Задание 4: Функция, которая сохранит содержимое каталога в список и выведет первые 5 элементов
        String directoryPath = "your_directory_path_here"; // Замените на путь к каталогу
        List<String> files = DirectoryReader.readDirectory(directoryPath);

        System.out.println("Contents of the directory:");
        for (String file : files) {
            System.out.println(file);
        }
    }
}
