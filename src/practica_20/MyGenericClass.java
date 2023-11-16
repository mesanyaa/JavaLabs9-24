package practica_20;

public class MyGenericClass<T, V, K> {
    private T value1;
    private V value2;
    private K value3;

    public MyGenericClass(T value1, V value2, K value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    public K getValue3() {
        return value3;
    }

    public void printClassNames() {
        System.out.println("Type of T: " + value1.getClass().getName());
        System.out.println("Type of V: " + value2.getClass().getName());
        System.out.println("Type of K: " + value3.getClass().getName());
    }
}
