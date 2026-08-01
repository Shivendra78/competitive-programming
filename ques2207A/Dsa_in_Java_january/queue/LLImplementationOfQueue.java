package queue;

// Node class
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// Queue class
class MyQueue {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    MyQueue() {
        head = tail = null;
        size = 0;
    }

    // Check if empty
    boolean isEmpty() {
        return size == 0;
    }

    // Peek (front element)
    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        return head.val;
    }

    // Dequeue
    int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }

        int front = head.val;
        head = head.next;
        size--;

        // 🔥 IMPORTANT FIX
        if (size == 0) {
            tail = null;
        }

        return front;
    }

    // Enqueue
    void enqueue(int val) {
        Node temp = new Node(val);

        if (isEmpty()) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    // Display queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Size
    int size() {
        return size;
    }
}

// Main class
public class LLImplementationOfQueue {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        // Enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.print("Queue: ");
        q.display();

        // Peek
        System.out.println("Front element: " + q.peek());

        // Dequeue
        System.out.println("Removed: " + q.dequeue());

        System.out.print("Queue after dequeue: ");
        q.display();

        // Size
        System.out.println("Size: " + q.size());

        // Empty check
        System.out.println("Is Empty? " + q.isEmpty());

        // Removing all
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println("Is Empty after removing all? " + q.isEmpty());

        //  This will throw error
        // q.dequeue();
    }
}