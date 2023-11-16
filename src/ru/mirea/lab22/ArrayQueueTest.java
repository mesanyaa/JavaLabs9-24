package ru.mirea.lab22;

import java.util.ArrayList;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>(4, String.class);
        queue.enqueue("cat");
        queue.enqueue("dog");
        queue.enqueue("crocodile");
        queue.enqueue("monkey");

        System.out.println("Array Queue: " + queue.show());
        System.out.println("Array queue size: " + queue.size());
        System.out.println("is Array Queue empty? " + queue.isEmpty());
        System.out.println("The first element: " + queue.element());

        System.out.println("Delete and get the first element: " + queue.dequeue());
        System.out.println("Array queue after altering the first element: " + queue.show());

        System.out.println("Clearing the Array Queue....");
        queue.clear();
        System.out.println("Array Queue after clearing: " + queue.show());
        System.out.println("Array queue size: " + queue.size());

        System.out.println("Trying delete the fist element...");
        queue.dequeue();
        queue.dequeue();
        System.out.println("Array queue size: " + queue.size());
    }
}
