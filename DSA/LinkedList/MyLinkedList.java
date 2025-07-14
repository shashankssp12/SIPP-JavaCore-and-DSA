// package DSA.LinkedList;

public class MyLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;
    private int size;

    // Constructor
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                secondLast = secondLast.next;
                lastNode = lastNode.next;
            }
            secondLast.next = null;
        }
        size--;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Return size of list
    public int getSize() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Search for an element
    public boolean search(int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) return true;
            curr = curr.next;
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.printList();        // 5 -> 10 -> 20 -> null

        list.deleteFirst();
        list.printList();        // 10 -> 20 -> null

        list.deleteLast();
        list.printList();        // 10 -> null

        System.out.println("Size: " + list.getSize());  // 1

        System.out.println("Is 10 present? " + list.search(10)); // true
        System.out.println("Is list empty? " + list.isEmpty());  // false
    }
}