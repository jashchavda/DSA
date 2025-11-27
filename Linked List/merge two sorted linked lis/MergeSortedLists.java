class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLists {

    // Function to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        // Base cases
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        // Case 1: head1 value <= head2 value
        if (head1.val <= head2.val) {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        } else { // Case 2: head2 value < head1 value
            head2.next = mergeTwoLists(head1, head2.next);
            return head2;
        }
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create first sorted list: 1 -> 3 -> 5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        // Create second sorted list: 2 -> 4 -> 6
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        // Merge both lists
        ListNode mergedHead = mergeTwoLists(head1, head2);

        System.out.println("Merged List:");
        printList(mergedHead);
    }
}
