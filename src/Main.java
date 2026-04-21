import java.util.ArrayList;
// Name: Julio Villarreal
// Class: CS303 Data Structures
// Date: 4/20/2026
// Assignment 3

public class Main {
    public static void main(String[] args) {
        System.out.println("Q1 - Queue Data Structure");
        MyQueue<Integer> queue = new MyQueue<>();

        // Loop for inserting 10 int values in the queue
        for (int i = 1; i <= 10; i++) {
            queue.offer(i * 10);
        }

        System.out.println("Elements of the Queue");
        int currentSize = queue.size();
        // Displays each element by moving the front element to the rear
        // After a cycle of size() the queue is back to its original order
        for (int i = 0; i < currentSize; i++) {
            Integer value = queue.peek();
            System.out.print(value + " ");
            queue.move_to_rear();
        }
        System.out.println();

        // Test move to rear
        System.out.println("Front before move to rear: " + queue.peek());
        queue.move_to_rear();
        System.out.println("Front after move to rear: " + queue.peek());

        System.out.println("Q2 - Recursive Search");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(7);
        numbers.add(12);
        numbers.add(20);

        int result = RecursiveSearch.findLastOccurrence(numbers, 12);
        System.out.println("Last occurrence of 12 at index - " + result);

        System.out.println("Q3 - Linked List Insertion Sort");
        LinkedListInsertionSort list = new LinkedListInsertionSort();
        list.add(34);
        list.add(8);
        list.add(64);
        list.add(51);
        list.add(32);
        list.add(21);

        System.out.print("Before sorting: ");
        list.display();

        list.insertionSort();

        System.out.print("After sorting: ");
        list.display();
    }
}