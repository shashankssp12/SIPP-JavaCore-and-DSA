public class WithoutAbstraction {
    public static void main(String[] args) {
        // Creating nodes manually
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        //// print manually
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");

        // Deleting 20 manually
        temp = head;
        if (temp.data == 20) {
            head = head.next;
        } else {
            while (temp.next != null && temp.next.data != 20) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        // Print again
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
