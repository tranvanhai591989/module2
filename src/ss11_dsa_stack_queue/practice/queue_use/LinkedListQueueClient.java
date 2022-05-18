package ss11_dsa_stack_queue.practice.queue_use;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(666);
        queue.enqueue(77);
        queue.enqueue(56);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


        queue.enqueue(3555);
        queue.enqueue(33);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}