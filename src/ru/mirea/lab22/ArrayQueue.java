package ru.mirea.lab22;

import java.lang.reflect.Array;

public class ArrayQueue<T> {

    private final Class<T> clazz;

    private T[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity, Class<T> clazz) {
        this.clazz = clazz;
        queue = (T[]) Array.newInstance(clazz, capacity);
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T data) {
        if (rear == queue.length - 1) {
            rear = -1;
        }
        queue[++rear] =  data;
        size++;
    }

    public T element() {
        return queue[front];
    }

    public T dequeue() {
        T temp = queue[front++];
        if (front == queue.length) {
            front = 0;
        }
        if (size != 0) size--;
        return temp;
    }

    public int size() { return size; }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public String show() {
        String result = "[ ";
        for (int i = front; i < rear + 1; i++) {
            result += queue[i] + " ";
        }
        return result + " ]";
    }
}
