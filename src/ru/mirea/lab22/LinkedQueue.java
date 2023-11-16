package ru.mirea.lab22;

public class LinkedQueue<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size;


    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public T element() {
        return head.data;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public String show() {
        String result = "[ ";
        Node<T> tempNode = head;
        while (tempNode != null) {
            result += tempNode.data + " ";
            tempNode = tempNode.next;
        }
        return result + " ]";
    }
}
