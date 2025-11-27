class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMiddle {
    Node head;

    // Add node at the end
    void addLast(int data) {
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

    // Find middle node
    Node findMiddle() {
        if (head == null) return null;

        Node slow = head; // moves 1 step
        Node fast = head; // moves 2 steps

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow is now at middle
    }

    // Print list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.printList(); // 10 -> 20 -> 30 -> 40 -> 50 -> null

        Node middle = list.findMiddle();
        System.out.println("Middle node is: " + middle.data); // Output: 30
    }
}
