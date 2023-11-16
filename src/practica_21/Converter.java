package practica_21;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
