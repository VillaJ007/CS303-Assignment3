public class MyQueue<T> {

    // Node class for linked list implementation
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Constructor for initializing empty queues
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Adds an element to the rear of the queue
    public void offer(T value) {
        Node newNode = new Node(value);

        if (empty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Removes and returns hte front element of the queue
    public T poll() {
        if (empty()) {
            return null;
        }

        T value = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Return the front element without removing it
    public T peek() {
        if (empty()) {
            return null;
        }
        return front.data;
    }

    // Returns the number of elements in the queue
    public int size() {
        return size;
    }

    // Returns true if the queue is empty
    public boolean empty() {
        return size == 0;
    }

    // Moves the front element to the rear using offer, peek and poll
    public void move_to_rear() {
        if (!empty()) {
            T frontValue = peek();
            poll();
            offer(frontValue);
        }
}
}
