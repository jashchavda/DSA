
// merge two sorted linked list 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {

    // Function to merge two sorted linked lists
    public static Node mergeTwoLists(Node head1, Node head2) {
        // Dummy node to build the result list
        Node dummy = new Node(-1);
        Node current = dummy;

        // Traverse both lists
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next; // Return merged list (skip dummy)
    }

    // Function to print a linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the function
    public static void main(String[] args) {
        // First list: 5 -> 10 -> 15 -> 40
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        // Second list: 2 -> 3 -> 20
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        System.out.println("List 1:");
        printList(head1);
        System.out.println("List 2:");
        printList(head2);

        // Merge the lists
        Node mergedHead = mergeTwoLists(head1, head2);

        System.out.println("Merged List:");
        printList(mergedHead);
    }
}
