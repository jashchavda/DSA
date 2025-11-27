import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // 1. Traverse and print the list
    void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 2. Insert at the beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3. Insert at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 4. Insert after a given node
    void insertAfter(int prevData, int data) {
        Node temp = head;
        while (temp != null && temp.data != prevData) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node with data " + prevData + " not found.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 5. Delete first node
    void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    // 6. Delete last node
    void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // 7. Delete a node by value
    void deleteByValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }
        temp.next = temp.next.next;
    }

    // 8. Count nodes
    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

// Main class
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        // Example usage
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.traverse(); // 10 -> 20 -> 30 -> null

        list.insertAtBeginning(5);
        list.traverse(); // 5 -> 10 -> 20 -> 30 -> null

        list.insertAfter(20, 25);
        list.traverse(); // 5 -> 10 -> 20 -> 25 -> 30 -> null

        list.deleteFirst();
        list.traverse(); // 10 -> 20 -> 25 -> 30 -> null

        list.deleteLast();
        list.traverse(); // 10 -> 20 -> 25 -> null

        list.deleteByValue(20);
        list.traverse(); // 10 -> 25 -> null

        System.out.println("Total nodes: " + list.countNodes()); // 2
    }
}
