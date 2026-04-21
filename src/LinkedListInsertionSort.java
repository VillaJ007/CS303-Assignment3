public class LinkedListInsertionSort {
    
    // Node class for linked lists
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add a value to the end of the ll
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Sorts the ll using insetrion sort
    public void insertionSort() {
        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }

        head = sorted;
    }

    // Inserts a node into the correct sorted position
    private Node sortedInsert(Node sorted, Node newNode) {
        if (sorted == null || newNode.data <= sorted.data) {
            newNode.next = sorted;
            return newNode;
        }

        Node current = sorted;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return sorted;
    }

    // Display all the elements in the ll
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
