package ss11_dsa_stack_queue.practice.initiQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}