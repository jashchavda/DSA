// Simple Linked List Implementation
class LL {

    // Node class (inner class)
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // head of the linked list
    private Node head;
    private int size;

    // Constructor (creates empty list)
    LL() {
        head = null;
        size = 0;
    }

    // Add element at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head; // link new node to old head
        head = newNode;      // head now points to new node
        size++;
    }

    // Add element at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) { // if list is empty
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) { // go to last node
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // Get size of list
    public int getSize() {
        return size;
    }

    // Main method to test
    public static void main(String[] args) {
        // Create first linked list
        LL list1 = new LL();
        list1.addFirst("B");
        list1.addFirst("A");
        list1.addLast("C");
        System.out.println("List 1:");
        list1.printList();

        // Create second linked list
        LL list2 = new LL();
        list2.addFirst("Y");
        list2.addLast("Z");
        list2.addFirst("X");
        System.out.println("List 2:");
        list2.printList();

        // Create third linked list
        LL list3 = new LL();
        list3.addLast("Dog");
        list3.addLast("Cat");
        list3.addLast("Rabbit");
        System.out.println("List 3:");
        list3.printList();
    }
}
