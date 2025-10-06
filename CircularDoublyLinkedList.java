class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CircularDoublyLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node last = head.prev;
        newNode.next = head;
        newNode.prev = last;
        head.prev = newNode;
        last.next = newNode;

        head = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head: " + head.data + ")");
    }

    boolean hasCycle() {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false; 
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.insert(10);
        cdll.insert(20);
        cdll.insert(30);
        cdll.display();
        System.out.println("Has Cycle: " + cdll.hasCycle());
    }
}
