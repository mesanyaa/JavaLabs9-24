package ru.mirea.lab22;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(10);
        queue.enqueue(-123);
        queue.enqueue(0);
        queue.enqueue(555);
        queue.enqueue(12);

        System.out.println("Linked Queue: " + queue.show());
        System.out.println("Linked queue size: " + queue.size());
        System.out.println("is Linked Queue empty? " + queue.isEmpty());
        System.out.println("The first element: " + queue.element());

        System.out.println("Delete and get the first element: " + queue.dequeue());
        System.out.println("Linked queue after altering the first element: " + queue.show());

        System.out.println("Clearing the Linked Queue....");
        queue.clear();
        System.out.println("Linked Queue after clearing: " + queue.show());
        System.out.println("Linked queue size: " + queue.size());

        System.out.println("Trying delete the fist element...");
        queue.dequeue();
        queue.dequeue();
        System.out.println("Linked queue size: " + queue.size());
    }
}