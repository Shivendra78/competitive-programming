package queue;

class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;

    CircularQueue(int capacity) {
        arr = new int[capacity];
        f = 0;
        r = 0;
        size = 0;
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is Full");
            return;
        }
        arr[r++]=val;
        if(r==arr.length){
            r=0;
            size++;
        }
    }

    int remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int frontVal=arr[f];
        f++;
        if(f==arr.length){
            f=0;
        }
        size--;
        return frontVal;
    }
    // Enqueue
    void enqueue(int val) {
        if (size == arr.length) {
            throw new RuntimeException("Queue is Full");
        }

        arr[r] = val;
        r = (r + 1) % arr.length;
        size++;
    }

    // Dequeue
    int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is Empty");
        }

        int frontVal = arr[f];
        f = (f + 1) % arr.length;
        size--;
        return frontVal;
    }

    int peekk(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f];
    }
    // Peek
    int peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is Empty");
        }
        return arr[f];
    }

    // Display
    void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            int index = (f + i) % arr.length;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}

// Main class
public class CircularArray {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display(); // 10 20 30 40

        System.out.println(q.dequeue()); // 10

        q.enqueue(50);
        q.enqueue(60);

        q.display(); // correct circular order
    }
}